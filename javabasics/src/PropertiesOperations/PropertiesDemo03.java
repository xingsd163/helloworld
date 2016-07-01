package PropertiesOperations;

import java.util.Enumeration;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author Nathan 先读，然后再写入 FileOutputStream Properties.setProperty()
 *         Properties.store()
 * 
 *         在 Demo02 基础上添加一个打印属性列表的方法
 */
public class PropertiesDemo03 {

	public static void main(String[] args) {

		PropertiesDemo03
				.printPropertiesList("E:\\Workspaces\\JavaBasics\\javabasics\\src\\PropertiesOperations\\dbconnection2.txt");

	}

	public static void printPropertiesList(String filename) {
		File myfile = new File(filename);
		// 在 try 语句块外先声明 FileInputStream 变量
		FileInputStream fis = null;
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

		while (enu.hasMoreElements()) {

			String key = (String) enu.nextElement();
			String value = p1.getProperty(key);
			System.out.print(key + "=");
			System.out.print(value);
			System.out.print("\r");

		}
	}
}
