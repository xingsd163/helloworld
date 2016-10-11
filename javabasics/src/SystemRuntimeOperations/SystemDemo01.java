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
		//��ȡϵͳ���еĻ�������
		Map<String, String> env = System.getenv();
		for(String name:env.keySet()){
			System.out.println(name + "=" + env.get(name));
		}
		
		System.out.println(System.getenv("JAVA_HOME"));
		System.out.println(System.getenv("os"));
		//��ȡ���е�ϵͳ����
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
		//����ض���ϵͳ����
		System.out.println(System.getProperty("os.name"));
		
	}


	}


