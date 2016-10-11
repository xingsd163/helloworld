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
 * DataOutputStream�ǹ��������ǹ�����չ������ֱ��д���ļ�
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
		//UTF���룬һ������ռ3���ֽ�
		dos.writeUTF("���簮������");
		//UTF-16BE����
		dos.writeChars("һ�н�Ϊ����");
		
		dos.close();
	
	}

}
