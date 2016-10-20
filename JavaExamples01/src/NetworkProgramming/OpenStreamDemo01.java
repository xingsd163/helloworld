package NetworkProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.Buffer;

/**
 * 
 * @author Nathan
 * 
 * openConnection(), 返回 URLConnection 对象，代表与URL所引用对象之间的连接
 * openStream(), 返回 InputStream，打开与此URL的连接，并返回一个读取该URL资源的InputStream
 * 
 * openStream() 方法可以读取该URL资源的InputStream，通过该方法可以非常方便地读取远程资源，甚至多线程下载
 * 
 * 可实现文件下载
 * 网页抓取
 * 
 */

public class OpenStreamDemo01 {
	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://www.runoob.com/java/net-webpage.html");
			//读取输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			//写入到文件
			BufferedWriter bw = new BufferedWriter(new PrintWriter(new File("webapp.html")));
			
			String line;
			while ((line = br.readLine()) != null) {
		         System.out.println(line);
		         bw.write(line);
		         bw.newLine();
		      }
			
			
		} catch (Exception  e) {
			// TODO: handle exception
		}
		
	}

}
