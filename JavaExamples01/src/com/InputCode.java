package com;

import java.util.Scanner;

/*
 * Scanner 类是 Java 的扫描器类，它可以从输入流中读取指定类型的数据或字符串。Scanner 类的 nextLine() 方法从输入流中获取用户输入的整行文本字符串。
 */
public class InputCode {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的手机号：");
		String phone = sc.nextLine();
		System.out.println("原来您的手机号是"+phone.length()+"位数的！");
	}

}
