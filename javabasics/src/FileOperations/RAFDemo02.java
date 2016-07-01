package FileOperations;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RAFDemo02 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File demo = new File("D:\\FileTest\\randomaccessfile.txt");
		
		RandomAccessFile raf = new RandomAccessFile(demo,"rw");
		System.out.print("获取初始游标位置：");
		System.out.println(raf.getFilePointer());
		
		byte[] b1 = new byte[1];
		int r = raf.read(b1);
		//将字节数组转换为字符串
		System.out.println(new String(b1));
		System.out.println(raf.getFilePointer());
		
		//追加内容
		raf.seek(raf.length());
		raf.write("\r\n你好吗？".getBytes("GBK"));
		//从中间位置插入数据会覆盖掉后面的内容
		//如果需要向指定位置插入内容，程序需要先把插入点后面的内容读入缓冲区，等把需要插入的数据写入文件后，再将缓冲区的内容追加到文件后面
		raf.seek(3);
		raf.write("\r\n清风明月算个屁啊，我才不稀罕呢？".getBytes("GBK"));
	}

}
