package FileInputOutputOperations;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileWriterDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File f3 = new File("hello1.txt");
		if(!f3.exists()){
			try {
				f3.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter fw1 =  new FileWriter(f3);
			fw1.write("Hello World\r\nThis is an example\r\n");
			fw1.write("Hello Java!\r\n");
			fw1.flush();
			fw1.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
