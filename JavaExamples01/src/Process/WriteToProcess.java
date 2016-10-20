package Process;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 
 * @author Nathan
 * 
 * 一个文件中可以包含两个类，但只有一个类是 public，每个类都可以都自己的main方法
 * 
 * Process java.lang.Runtime.exec(String command) throws IOException，Executes the specified string command in a separate process. 
 *
 */

public class WriteToProcess {
	
	public static void main(String[] args) throws IOException {
		//运行 java ReadStandard 命令，返回运行该命令的子进程
		Process process = Runtime.getRuntime().exec("java ReadStandard");
		
		try(
			//以p进程的输出流创建PrintStream对象
			//这个输出流对本程序是输出流，对p进程则是输入流
			PrintStream ps = new PrintStream(process.getOutputStream());)
			
		{
			//向ReadStandard程序写入内容，这些内容将被ReadStandard 读取
			//ps.println("普通字符串");
			//ps.println(new WriteToProcess());
		}
		
		
		
	}

}

class ReadStandard{
	public static void main(String[] args) throws FileNotFoundException {
		
		try(
			Scanner scanner = new Scanner(System.in);
			PrintStream psPrintStream = new PrintStream(new FileOutputStream(new File("out.txt")));
			)
		{
			scanner.useDelimiter("\n");
			System.out.println("请输入：");
			while(scanner.hasNext()){
				psPrintStream.println("键盘输入的内容是："+scanner.next());
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}