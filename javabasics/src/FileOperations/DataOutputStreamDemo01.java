package FileOperations;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 
 * @author Nathan
 * 
 * DataOutputStream是过滤器，是功能扩展，不能直接写入文件
 *
 */
public class DataOutputStreamDemo01 {
	
	public static void main(String[] args) throws IOException{
		File file = new File("D:\\FileTest\\dos.dat");
		file.createNewFile();
		FileOutputStream fos = new FileOutputStream(file);
		
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(100);
		dos.writeDouble(299L);
		//UTF编码，一个汉字占3个字节
		dos.writeUTF("假如爱有天意");
		//UTF-16BE编码
		dos.writeChars("一切皆为虚妄");
		
		dos.close();
	
	}

}
