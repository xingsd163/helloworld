package SerializationOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	/**
	 * 反序列化
	 * @param args
	 * @throws  
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args)  {
		
		Employee e6 = null;
		
		try{
			
			File f = new File("d:\\Employee.ser");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream in = new ObjectInputStream(fis);
			e6 = (Employee)in.readObject();
			in.close();
			fis.close();
			
		}catch(FileNotFoundException e3){
			System.out.println("错误-找不到文件！");
			e3.printStackTrace();
		}catch(IOException e4){
			e4.printStackTrace();
		}catch(ClassNotFoundException e5){
			e5.printStackTrace();
		}
			System.out.println("Name: " + e6.name);
			System.out.println("Address: " + e6.address);
		
	}

}
