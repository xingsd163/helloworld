package FileOperations;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo01 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File demo = new File("D:\\FileTest\\randomaccessfile.txt");
		if(!demo.exists()){
			demo.createNewFile();
		}
		
		RandomAccessFile raf = new RandomAccessFile(demo,"rw");
		System.out.print("��ȡ��ʼ�α�λ�ã�");
		System.out.println(raf.getFilePointer());
		raf.write('A');
		System.out.print("д���ַ�A֮����α�λ�ã�");
		System.out.println(raf.getFilePointer());
		raf.write('B');
		System.out.print("д���ַ�B֮����α�λ�ã�");
		System.out.println(raf.getFilePointer());
		
		String s = "�й�";
		
		byte[] bytes = s.getBytes("GBK");
		raf.write(bytes);
		System.out.print("д�뺺���й�֮����α�λ�ã�");
		System.out.println(raf.getFilePointer());
		
		System.out.println("�Ƶ��ļ�ͷ��");
		raf.seek(0);
		System.out.println(raf.getFilePointer());
		
		System.out.println("�ļ�����");
		System.out.println(raf.length());
		
	}

}
