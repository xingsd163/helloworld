package Process;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessDemo02 {
	
	 public static void main(String[] args) {
		   try {
		   // create a new process
		   System.out.println("Creating Process...");
		   Process p = Runtime.getRuntime().exec("netstat");

		   // 获取输入流
		   InputStream in = p.getInputStream();
		   //将输入流打印输出
		   BufferedReader bReader = new BufferedReader(new InputStreamReader(in));
		   String line=null;
		   while((line=bReader.readLine())!=null){
			   System.out.println(line);
		   }
		   

		   // close the output stream
		   System.out.println("Closing the output stream...");
		   in.close();
		   

		   } catch (Exception ex) {
		   ex.printStackTrace();
		   }

		   }

}
