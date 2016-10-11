package DateAndCalendar;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author Nathan
 * 
 * java.util.Calendar
 * Calendar 可以更好地处理日期和时间
 * Calendar 是一个抽象类，它用于表示日历。
 * 
 * Java还提供了一个 GregorianCalendar 类，它代表了我们所说的公历。
 * 
 * 抽象类，使用 getInstance() 方法获取 Calendar 对象
 * getInstance() 方法根据TimeZone,Locale 类来获取特定的 Calendar，如果不指定，则使用默认的TimeZone，Locale
 * 
 * TimeZone
 * Locale
 * 
 * Calendar.get(int field), field是静态字段，例如 Calendar.YEAR, Calendar.MONTH
 * 
 * 
 * java.util.Calendar.Month,  The first month of the year in the Gregorian and Julian calendars is JANUARY which is 0
 * 第一个月份是0
 */

public class CalendarDemo01 {
	
	public static void main(String[] args){
		
		//Calendar 和 Date 都是表示时间的工具类，它们直接可以自由转换
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		System.out.println(d);
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("今天是2016年的第"+c.get(Calendar.DAY_OF_YEAR)+"天");
		
		System.out.println("今天是一周中的第"+c.get(Calendar.DAY_OF_WEEK)+"天");
		
		int weekday = c.get(Calendar.DAY_OF_WEEK);
		
		//使用switch分支语句来判断星期几
		
		switch (weekday) {
		case 1:
		{
			System.out.println("今天是星期天");
			break;
		}
		case 2:
		{
			System.out.println("今天是星期一");
			break;
		}
		
		case 3:
		{
			System.out.println("今天是星期二");
			break;
		}

		default:
			break;
		}
		
		
		//set 方法、add方法和roll 方法
		
		c.set(2010,4,5,23,21,44);//2010-04-05 23:21:44
		System.out.println(c.getTime());
		//设置年份
		c.set(Calendar.YEAR,2015);
		System.out.println(c.get(Calendar.YEAR));
		
		c.add(Calendar.YEAR, 3);//2015+3
		System.out.println(c.getTime());

		
		
	}

}
