package PropertiesOperations;

import java.util.Enumeration;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import PropertiesOperations.PropertiesDemo03;


/**
 * 
 * @author Nathan
 * �ȶ���Ȼ����д��
 * FileOutputStream
 * Properties.setProperty()
 * Properties.store()
 */
public class PropertiesDemo02 {

	public static void main(String[] args) {
		File myfile = new File("E:\\Workspaces\\JavaBasics\\javabasics\\src\\PropertiesOperations\\dbconnection2.txt");
		//�� try ������������ FileInputStream ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(myfile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Properties p1 = new Properties();
		try {
			p1.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Enumeration<?> enu = p1.propertyNames();
		
		while(enu.hasMoreElements()){
			
			String key = (String) enu.nextElement();
			String value = p1.getProperty(key);
			System.out.print(key+"=");
			System.out.print(value);
			System.out.print("\r");			
			
		}
				
		p1.setProperty("hostname", "nathan-pc");
		p1.setProperty("company", "IBM");
		p1.setProperty("location","China,Shanghai");
		
		try {
			fos = new FileOutputStream(myfile);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			p1.store(fos, "test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(fos!=null){
				try{
					fos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		
		//���� Properties03 ���еľ�̬���� printPropertiesList
		System.out.println("��ӡ���б�");
		PropertiesDemo03.printPropertiesList("E:\\Workspaces\\JavaBasics\\javabasics\\src\\PropertiesOperations\\dbconnection2.txt");

	}
	
}
