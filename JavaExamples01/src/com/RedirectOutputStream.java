package com;

import java.io.PrintStream;

/*
 * 输出流的重定向，将它指向一个文件输出流，从而实现日志功能。
 * System.setout()
 * 
 * 打印流 
 * PrintStream
 * 
 * PrintStream java.lang.System.out
 * System.out 是 PrintStream 类型的
 * 
 * 
 * 
 */
public class RedirectOutputStream {

	public static void main(String[] args) {
		
		try {
			PrintStream out = System.out; //保存原输出流
			PrintStream ps = new PrintStream("log.txt");//创建文件输出流
			System.setOut(ps); //设置新的输出流
			
			int age = 18;
			System.out.println("年龄变量定义成功，初始值是18");
			String sex="女";
			System.out.println("性别变量定义成功，初始值是女");
			String info = "这是个"+sex+"孩子，应该有"+age+"岁了。";
			System.out.println("整合两个变量为info字符串，其结果是："+ info);
			
			System.setOut(out); //恢复原有输出流
			System.out.println("程序运行完毕，请查看日志文件。");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
