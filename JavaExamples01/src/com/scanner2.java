package com;

import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			String phone = sc.nextLine();
			System.out.println(phone);
			
			if(phone.equals("exit"))
				System.exit(0);
			phone.equals("h");
			
		}
		

	}

}
