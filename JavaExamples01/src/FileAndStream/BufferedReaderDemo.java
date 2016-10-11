package FileAndStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import javax.xml.stream.events.EndDocument;

/**
 * 
 * @author Nathan
 * 
 * 将165000条日志从文件中读取然后打印到控制台
 * 查看执行时间
 *
 */

public class BufferedReaderDemo {
	public static void main(String[] args) throws FileNotFoundException {
		
		long start = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new FileReader("cisco.log"));
		
		//将控制台输出重定向到文件
		System.setOut(new PrintStream("cisco1.txt"));
		
		String line;
		try {
			while ((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		
		long costime = end - start;
		
		System.out.println("执行耗时:"+costime);
		
	}

}
