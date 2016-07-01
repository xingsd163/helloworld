package SerializationOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	/**
	 * –Ú¡–ªØ
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="Nathan";
		e.address="Shanghai,China";
		e.ssn=123456789;
		e.number=101;
		
		try{
			
			File f = new File("d:\\employee.ser");
			FileOutputStream fis = new FileOutputStream(f);
			ObjectOutputStream out = new ObjectOutputStream(fis);
			out.writeObject(e);
			out.close();
			fis.close();
			
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}

}
