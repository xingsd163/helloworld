package FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InsertContent {

	/**
	 * @param args
	 * 从中间位置插入数据会覆盖掉后面的内容
	 * 如果需要向指定位置插入内容，程序需要先把插入点后面的内容读入缓冲区，等把需要插入的数据写入文件后，再将缓冲区的内容追加到文件后面
	 * 
	 * 临时文件将在 JVM 退出时被删除，用以保存被插入文件的插入点后的内容。程序先将文件中插入点后的内容读入临时文件中，然后重新定位到
	 * 插入点，将需要插入的内容添加到文件后面，最后将临时文件的内容添加到文件后面。
	 * 
	 * 学习使用临时文件
	 */
	
	public static void insert(String fileName,long pos, String insertContent) throws IOException{
		//创建一个临时文件，用于保存插入点后的数据
		File temp = File.createTempFile("temp", "tmp");
		temp.deleteOnExit();
		
		RandomAccessFile raf = new RandomAccessFile(fileName,"rw");
		//创建文件输入流和输出流
		FileInputStream tmpIn = new FileInputStream(temp);
		FileOutputStream tmpOut = new FileOutputStream(temp);
		
		raf.seek(pos);
		
		//（1）----将插入点后的内容读入临时文件中保存----
		
		//每次读取的字节数，保存在数据中
		byte[] bbuf = new byte[64];
		//用于保存实际读取的字节数
		int hasRead = 0;
		
		//使用循环方式读取插入点后的数据
		while((hasRead=raf.read(bbuf))>0){
			//将读取的数据写入临时文件
			tmpOut.write(bbuf,0,hasRead);
		}
		
		//(2)----插入内容----
		//将文件记录指针重新定位到pos位置
		raf.seek(pos);
		raf.write(insertContent.getBytes("GBK"));
		
		//(3)追加临时文件中的内容
		while((hasRead=tmpIn.read(bbuf))>0){
			raf.write(bbuf,0,hasRead);
		}
		
		
		
		
	}
	

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InsertContent.insert("D:\\FileTest\\randomaccessfile.txt",30,"[这就是我要插入的内容，你看到了没？]");

	}

}
