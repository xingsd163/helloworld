package PropertiesOperations;

import java.util.Enumeration;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author Nathan �ȶ���Ȼ����д�� FileOutputStream Properties.setProperty()
 *         Properties.store()
 * 
 *         �� Demo02 ���������һ����ӡ�����б�ķ���
 */
public class PropertiesDemo03 {

	public static void main(String[] args) {

		PropertiesDemo03
				.printPropertiesList("E:\\Workspaces\\JavaBasics\\javabasics\\src\\PropertiesOperations\\dbconnection2.txt");

	}

	public static void printPropertiesList(String filename) {
		File myfile = new File(filename);
		// �� try ������������ FileInputStream ����
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
