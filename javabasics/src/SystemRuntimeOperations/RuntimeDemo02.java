package SystemRuntimeOperations;

import java.io.IOException;

public class RuntimeDemo02 {
	
	public static void main(String[] args) throws IOException{
		
		Runtime rt = Runtime.getRuntime();
		rt.exec("mstsc.exe");
		rt.exec("notepad.exe");
	}

}
