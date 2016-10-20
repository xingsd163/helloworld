package NetworkProgramming;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 
 * @author Nathan java.net.URL类，例如 http://www.runoob.com/java/java-examples.html
 *         http://192.168.0.126:8088/cluster
 * 
 *         解析URL 获取远程文件大小
 *         openConnection(), 返回 URLConnection 对象，代表与URL所引用对象之间的连接
 *
 */

public class URLDemo01 {

	public static void main(String[] args) {

		// 解析URL
		URL url1;
		try {
			url1 = new URL("http://192.168.0.126:8088/cluster");
			System.out.println(url1.getHost());
			System.out.println(url1.getPort());
			System.out.println(url1.getProtocol());
			System.out.println(url1.getPath());
			System.out.println(url1.getFile());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("**************");
		// 获取远程文件大小
		URL url2;
		try {

			url2 = new URL("http://mirror.rise.ph/eclipse/oomph/epp/neon/R1/eclipse-inst-win64.exe");
			// openConnection(), 返回一个 URLConnection 对象，它代表了与URL所引用的远程对象的连接

			URLConnection urlConnection = url2.openConnection();
			System.out.println(urlConnection.getContentLength());

			int size = urlConnection.getContentLength();

			if (size > 1024 * 1024) {
				float sizeinmb = size / 1024 / 1024;
				System.out.println("文件大小是"+sizeinmb + "MB");
			}

			// 返回上次修改日期，返回的 Long 毫秒
			long lastmodified = urlConnection.getLastModified();
			Date date = new Date(lastmodified);
			System.out.println("上次修改日期是："+date);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
