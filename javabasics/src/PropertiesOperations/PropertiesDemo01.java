package PropertiesOperations;

import java.util.Enumeration;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//读取属性文件中的元素

public class PropertiesDemo01 {


	/**
	 * @author Nathan
	 */
	public static void main(String[] args) {
		File myfile = new File("E:\\Workspaces\\JavaBasics\\javabasics\\src\\PropertiesOperations\\dbconnection.txt");
		//在 try 语句块外先声明 FileInputStream 变量
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(myfile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Properties p1 = new Properties();
		try {
			//加载
			p1.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Enumeration<?> enu = p1.propertyNames();
		//遍历所有元素
		while(enu.hasMoreElements()){
			
			String key = (String) enu.nextElement();
			String value = p1.getProperty(key);
			System.out.print(key+"=");
			System.out.print(value);
			System.out.print("\r");
			
			
		}

	}

}
