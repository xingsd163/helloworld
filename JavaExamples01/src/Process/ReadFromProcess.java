package Process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Nathan
 * 
 * Runtime 对象的 exec() 方法会产生一个Process对象，Process对象代表由该Java程序启动的子进程。
 * Process类提供了三个方法，用于让程序与其子进程进行通信。
 * InputStream, getErrorStream()，获取子进程的错误流,Returns the input stream connected to the error output of the subprocess. The stream obtains data piped from the error output of the process represented by this Process object.
 * InputStream, getInputStream(),获取子进程的输入流
 * OutputStream,getOutputStream(),获取子进程的输出流
 * 
 * 子进程读取程序的数据，就是让程序把数据输出到子进程中
 *
 */

public class ReadFromProcess {
	
	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec("javac");
		//将子进程的错误输出作为该程序的输入流
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			String buff = null;
			System.out.println("javac");
			while ((buff=br.readLine())!=null) {
				
				System.out.println(buff);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
