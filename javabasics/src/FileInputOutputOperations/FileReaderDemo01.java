package FileInputOutputOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo01 {

	/**
	 * @param args
	 * 
	 * public int read() throws IOException, ��ȡ�����ַ�������һ��int�ͱ��������ȡ�����ַ�
	 * 
	 * public int read(char [] c, int offset, int len), ��ȡ�ַ���c���飬���ض�ȡ���ַ��ĸ���
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
