package DateAndCalendar;

import java.util.Date;

/**
 * 
 * @author Nathan
 * 
 * java.util.Date
 * Date 对象既包含日期，也包含时间。从 JDK1.0开始存在，大部分构造器、方法已经过时，不推荐使用。
 * 
 * Date() 构造器：生成一个代表当前日期时间的Date对象。该构造器在底层调用 System.currentTimeMillis() 获得long整数作为日期参数。
 * 
 * 方法：
 * 
 * boolean equals(Object date)
 * 当调用此方法的Date对象和指定日期相等时候返回true,否则返回false。
 * 
 * long getTime( )
 * 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
 * 
 * String toString( )
 * 转换Date对象为String表示形式，并返回该字符串。
 * 
 * 日期比较：
 * 
 * before()
 * after()
 * 
 */

public class DateTest01 {
	
	public static void main(String[] args){
	Date d = new Date();
	long l = d.getTime();
	
	System.out.println(l);
	System.out.println("当前时间是："+d.toString());
	
	}

}
