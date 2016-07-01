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
		System.out.print("获取初始游标位置：");
		System.out.println(raf.getFilePointer());
		raf.write('A');
		System.out.print("写入字符A之后的游标位置：");
		System.out.println(raf.getFilePointer());
		raf.write('B');
		System.out.print("写入字符B之后的游标位置：");
		System.out.println(raf.getFilePointer());
		
		String s = "中国";
		
		byte[] bytes = s.getBytes("GBK");
		raf.write(bytes);
		System.out.print("写入汉字中国之后的游标位置：");
		System.out.println(raf.getFilePointer());
		
		System.out.println("移到文件头部");
		raf.seek(0);
		System.out.println(raf.getFilePointer());
		
		System.out.println("文件长度");
		System.out.println(raf.length());
		
	}

}
