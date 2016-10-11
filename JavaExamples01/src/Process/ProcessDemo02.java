package Process;

import java.io.OutputStream;

public class ProcessDemo02 {
	
	 public static void main(String[] args) {
		   try {
		   // create a new process
		   System.out.println("Creating Process...");
		   Process p = Runtime.getRuntime().exec("netstat");

		   // get the output stream
		   OutputStream out = p.getOutputStream();

		   // close the output stream
		   System.out.println("Closing the output stream...");
		   out.close();

		   } catch (Exception ex) {
		   ex.printStackTrace();
		   }

		   }

}
