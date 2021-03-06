package FileAndStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author Nathan
 * 
 * 使用字节流复制文件
 * FileInputStream 和 FileOutputStream
 * 
 * 
 * 注意 read() 方法返回的类型是 int，write() 方法接受的也是 int 类型
 * 
 *  java中read方法返回的int类型：如果返回char, 那么无法表示流末尾. 
 *  char的取值范围是从0到65535。这个范围内的所有字符, 都有可能在数据中出现。
 *  需要使用一个不可能在数据中出现的值来表示流末尾。那么Java中就是用-1来表示这个末尾的, 
 *  因为-1不会在数据中出现。而为了返回-1, 那么只能用int。当流中读取到一个字符时, read()方法内部就会当作int返回, 
 *  如果读到流末尾, 直接返回-1。
 * 
 * 
 * 
 * 文件大小185MB
 * 一次读取1K，
 * 复制开始！
 * 复制完毕，共耗时1011毫秒
 * 
 * 一次读取3k时，耗时393毫秒
 * 一次读取10K时耗时190毫秒
 * 一次读取30K时耗时120毫秒
 * 一次读取300K时耗时80毫秒
 * 再大也是维持在80毫秒左右
 * 
 * 
 */

public class CopyBytes02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		System.out.println("复制开始！");
		long start = System.currentTimeMillis();
		
		try {
			in = new FileInputStream("original.txt");
			out = new FileOutputStream("outagain.txt");
			
			int c = 0;
			byte[] bytes = new byte[100000];
			
			while ((c=in.read(bytes))!=-1) {
				out.write(c);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if(in!=null){
				in.close();
			}
			
			if(out!=null){
				out.close();
			}
		}
		
		long stop=System.currentTimeMillis();
		long interval = stop - start;
		
		System.out.println("复制完毕，共耗时"+interval+"毫秒");

	}

}
