package DateAndCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Nathan
 * 
 * java.text.SimpleDateFormat
 * java.util.Date
 * 
 * SimpleDateFormat is a concrete class for formatting and parsing dates in a locale-sensitive manner. 
 * It allows for formatting (date -> text), parsing (text -> date), and normalization.  
 * 
 * 日期的解析和格式化
 *
 */

public class SimpleDateFormat01 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("当前时间是： "+ formatter.format(d));
		
		SimpleDateFormat formatter01 = new SimpleDateFormat("MM-dd-yyyy");
		String input = "04-05-1998";
		//解析日期
		Date t = formatter01.parse(input);
		System.out.println(t.toString());
		//格式化日期
		System.out.println(formatter.format(t));
		
		

	}

}
