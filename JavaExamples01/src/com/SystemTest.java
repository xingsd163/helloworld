package com;

/**
 * 
 * @author Nathan
 * 
 * Terminates the currently running Java Virtual Machine. The argument serves as a status code; 
 * by convention, a nonzero status code indicates abnormal termination. 
 * This method calls the exit method in class Runtime. This method never returns normally. 
 * The call System.exit(n) is effectively equivalent to the call: 
 * Runtime.getRuntime().exit(n)
 *
 */

public class SystemTest {
	
	public static void main(String[] args){
		
		System.out.println("第一行");
		System.out.println("第二行");
		System.exit(0);
	/*	Runtime.getRuntime().exit(0);*/
		System.out.println("此行不显示");
	}

}
