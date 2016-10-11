package com;

public class equalstest {
	
	public static void main(String[] args){
	
	String a = "haha";
	String b = "Haha";
	String c = new String("Haha");
	
	if(a.equalsIgnoreCase(b)){
		
		System.out.println("ab相等");
		
	}
	
	if(a==b){
		System.out.println("ab相等");
	}
	else {
		System.out.println("ab不相等");
	}
	
	if (b.equals(c)) {
		System.out.println("bc的值相等");
		
	}
	
	if(b!=c){
		System.out.println("bc不是同一个对象");
	}
	
	}
	

}

/**
 * 
 * 
 * Java基本类型包括：整数型、字符型、布尔型、浮点型，共4种
 * 
 * String 不是基本类型，是引用类型
 * 
 * String a = "haha"; 在内存中创建一个对象并指向a；
 * String b = "Haha"; 在内存中创建一个对象并指向 b；
 * 
 * a和b内存地址不通，字符串序列不同，所以使用 equals 和 == 比较都不同。如果忽略大小写比较字符串序列则相同；
 * 
 * String c = new String("Haha"); 在内存中创建一个新的对象，字符串序列与b相同，但内存地址不同，所以 equals 比较相同，但 == 比较不同。
 * 
 * equals 比较的是字符串序列
 * == 则比较的是内存地址
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
