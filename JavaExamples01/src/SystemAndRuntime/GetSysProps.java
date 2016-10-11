package SystemAndRuntime;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class GetSysProps {
	
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new File("sysprops.properties"));
		Properties props = System.getProperties();
		props.list(pw);
		pw.flush();
		pw.close();
		
		System.out.println(System.getProperty("java.vm.name"));
		System.out.println(System.getProperty("java.runtime.name"));
		
		FileOutputStream fos = new FileOutputStream(new File("sysprops.properties"));
		
		props.setProperty("MyName", "Nathan");
		props.setProperty("MyName2", "Haha");
		props.store(fos,"haha");
		
		
		
	}

}
