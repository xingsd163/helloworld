package com;

import java.util.Scanner;

public class Scanner03 {
	
	public static void main(String[] argsStrings){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入：");
		
		while (sc.hasNext() ) {
			
			
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("exit")) {
				System.out.println("程序即将退出....");
				Runtime.getRuntime().exit(0);
			}
			System.out.print("您输入的是： " + input);
			System.out.println();
			
			System.out.println("请输入：");
			
		}
	}

}
