package NetworkProgramming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * @author Nathan
 * 
 * java.net.InetAddress，代表IP地址
 * 没有构造器，提供两个静态方法获取实例：getByName(), getByAddress()
 * 
 *
 */

public class InetAddressDemo01 {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress ip = InetAddress.getByName("myhadoop.fulan.com");
		try {
			System.out.println("判断是否可达："+ip.isReachable(1000));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		 * 在Windows平台上执行上述程序始终返回false。
		 * 因为isReachable() 方法底层是使用 ICMP协议建立连接，但在Windows上并没有采用ICMP来实现。
		 * A typical implementation will use ICMP ECHO REQUESTs if the privilege can be obtained, 
		 * otherwise it will try to establish a TCP connection on port 7 (Echo) of the destination host.
		 * 
		 */
		//返回 180.168.41.175
		System.out.println(ip.getHostAddress());
		
		//返回 myhadoop.fulan.com
		System.out.println(ip.getHostName());
		
		InetAddress ip2 = InetAddress.getByAddress(new byte[]{127,0,0,1});
		System.out.println(ip2.getHostName());
		
		InetAddress ip3 = InetAddress.getLocalHost();
		System.out.println(ip3.getHostAddress());
		System.out.println(ip3.getHostName());
		System.out.println(ip3.getCanonicalHostName());
		
		
		
		
		
		
	}
}
