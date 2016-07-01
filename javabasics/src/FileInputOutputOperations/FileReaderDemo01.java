package FileInputOutputOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo01 {

	/**
	 * @param args
	 * 
	 * public int read() throws IOException, 读取单个字符，返回一个int型变量代表读取到的字符
	 * 
	 * public int read(char [] c, int offset, int len), 读取字符到c数组，返回读取到字符的个数
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File f4 = new File("E:\\Workspaces\\JavaBasics\\javabasics\\hello1.txt");
		try {
			FileReader fr1 = new FileReader(f4);
			char[] a = new char[150];
			fr1.read(a);
			
			for(char c:a){
				System.out.print(c);
			}
			fr1.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
