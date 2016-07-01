package SystemRuntimeOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class SystemDemo01 {

	/**
	 * @author Nathan
	 */
	public static void main(String[] args) {
		//获取系统所有的环境变量
		Map<String, String> env = System.getenv();
		for(String name:env.keySet()){
			System.out.println(name + "=" + env.get(name));
		}
		
		System.out.println(System.getenv("JAVA_HOME"));
		System.out.println(System.getenv("os"));
		//获取所有的系统属性
		Properties props = System.getProperties();
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream("E:\\Workspaces\\JavaBasics\\javabasics\\src\\props.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			props.store(fos, "System Properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		//输出特定的系统属性
		System.out.println(System.getProperty("os.name"));
		
	}


	}


