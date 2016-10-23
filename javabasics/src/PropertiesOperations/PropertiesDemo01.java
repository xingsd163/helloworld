package PropertiesOperations;

import java.util.Enumeration;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//��ȡ�����ļ��е�Ԫ��

public class PropertiesDemo01 {


	/**
	 * @author Nathan
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File myfile = new File("dbconnection.txt");
		//�� try ������������ FileInputStream ����
		if(!myfile.exists()){
			myfile.createNewFile();
		}
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(myfile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Properties p1 = new Properties();
		try {
			//����
			p1.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Enumeration<?> enu = p1.propertyNames();
		//��������Ԫ��
		while(enu.hasMoreElements()){
			
			String key = (String) enu.nextElement();
			String value = p1.getProperty(key);
			System.out.print(key+"=");
			System.out.print(value);
			System.out.print("\r");
			
			
		}

	}

}
