package FileOperations;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author Nathan
 * 
 * DataInputStream 和 DataOutputStream 是过滤流
 * BufferedInputStream 和 BufferedOutputStream 是缓冲流
 *
 */

public class DataInputStreamDemo01 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\FileTest\\dos.dat");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		int i = dis.readInt();
		System.out.println(i);
		
		double d = dis.readDouble();
		System.out.println(d);
		
		String chars = dis.readUTF();
		System.out.println(chars);
		
	
		

	}

}
