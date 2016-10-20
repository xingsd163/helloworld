package NetworkProgramming;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * 
 * @author Nathan
 * 
 *         openConnection(), 返回 URLConnection 对象，代表与URL所引用对象之间的连接 openStream(),
 *         返回 InputStream，打开与此URL的连接，并返回一个读取该URL资源的InputStream
 * 
 *         openStream() 方法可以读取该URL资源的InputStream，通过该方法可以非常方便地读取远程资源，甚至多线程下载
 * 
 *         下载二进制文件
 *         读写的是二进制文件，因此应该使用字节流，BufferedInputStream 和 BufferedOutputStream
 *         
 *         write(byte[] b, int off, int len)
 *		   Writes len bytes from the specified byte array starting at offset off to this buffered output stream.
 *		   如果设置了每次读的数组大小，应该使用该方法
 *
 *		   write(int b), Writes the specified byte to this buffered output stream.
 * 
 * 
 */

public class OpenStreamDemo2 {
	public static void main(String[] args) throws IOException {
		
		long start = System.currentTimeMillis();
		URL url;
		InputStream iStream;
		FileOutputStream fileOutputStream;
		BufferedOutputStream bufferedOutputStream = null;
		BufferedInputStream bis = null;
		
		File file = new File("eclipse.exe");
		if(file.exists()){
			file.delete();
		}
		
		try {
			//url = new URL("http://b.hiphotos.baidu.com/baike/c0%3Dbaike92%2C5%2C5%2C92%2C30/sign=4890177b564e9258b2398ebcfdebba3d/3812b31bb051f819c7abfc55dab44aed2e73e727.jpg");
			// 读取输入流
			url=new URL("http://mirror.rise.ph/eclipse/oomph/epp/neon/R1/eclipse-inst-win64.exe");
			iStream = url.openStream();
			fileOutputStream = new FileOutputStream(new File("eclipse.exe"));
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			
			bis = new BufferedInputStream(iStream);
			byte[] bbuf = new byte[10240];
			int hasRead = 0;
			System.out.println("程序正在执行...");
			while ((hasRead = bis.read(bbuf)) !=-1) {

				//System.err.println(bbuf);
				bufferedOutputStream.write(bbuf,0,hasRead);
				//注意此处的写法：bufferedOutputStream.write(bbuf,0,hasRead)， 如果是bufferedOutputStream.write(bbuf)这种写法，则会导致
				//最终的文件不可读，如果是图片则会导致某些像素丢失
				//Ordinarily this method stores bytes from the given array into this stream's buffer, flushing the buffer
				//to the underlying output stream as needed. If the requested length is at least as large as this stream's buffer, however, 
				//then this method will flush the buffer and write the bytes directly to the underlying output stream.
				

			}

			// 写入到文件

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bis!=null){
					bis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			try {
				if (bufferedOutputStream!=null) {
					bufferedOutputStream.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}

		System.out.println("读写完毕！");
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println("耗时"+duration+"毫秒。");

	}

}
