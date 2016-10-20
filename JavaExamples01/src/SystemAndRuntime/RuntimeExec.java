package SystemAndRuntime;

/**
 * Process
 * Runtime
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RuntimeExec {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		try {
			
			Process p;
			//rt.exec("notepad.exe");
			//rt.exec("mstsc.exe");
			//String[] commands = {"cmd","/C","splunk start"};
			//String[] commands = {"cmd","/C","splunk stop"};
			//String[] commands = {"cmd","/C","ipconfig"};	
			String[] commands = {"cmd","/C","netstat"};
			//String[] commands = {"cmd","/C","notepad"};
			//String[] commands = {"cmd","/C","C:\\Program Files (x86)\\Tencent\\TGP\\tgp_launcher.exe"};
			
			
			p= rt.exec(commands);
			
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line=br.readLine())!=null) {
				System.out.println(line);
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
