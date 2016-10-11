package MapDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;


/**
 * 
 * @author Nathan
 * Properties 类是 Hashtable 的子类
 * Properties 类里的 key、value 都是字符串类型
 * 
 * 获取修改属性值：
 * Properties.getProperty(String key)
 * Properties.setProperty(String key,String value)
 * 
 * 读写属性文件的方法：
 * Properties.load(InputStream inStream), 从属性文件(以输入流表示)中加载key-value对
 * Properties.store(OutputStream outStream)，将 Properties 中的 key-value 对输出到指定的属性文件
 *
 */
public class PropertiesTest01 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties pros = new Properties();
		pros.setProperty("name", "wx");
		pros.setProperty("sex", "male");
		pros.setProperty("age","19");
		pros.setProperty("company", "fulan");
		
		System.out.println("Properties 类的大小："+pros.size());
		
		//将属性值存储到属性文件中
		pros.store(new FileOutputStream("mypros.ini"), "This is a property file");
		
		Properties pros1 = new Properties();
		//从属性文件加载属性值到Properties类中
		pros1.load(new FileInputStream("mypros.ini"));
		//Map.keySet() 返回key值的Set集合
		Set<Object> set01 = pros1.keySet();
		
		System.out.println("***列出key值***");
		//使用 foreach 循环遍历 Set集合
		for(Object obj:set01)
		{
			System.out.println((String)obj);
		}
		
		
		System.out.println("name的值： "+pros1.getProperty("name"));
		System.out.println("sex的值： "+pros1.getProperty("sex"));
		
	}

}
