package DateAndCalendar;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

//在地理上，地球被划分为24个时区，中国北京时间属于东八区，而程序中时间的默认实现是格林威治时间为标准的，这样就产生了8个小时的时间差。
//TimeZone 是一个抽象类，不能调用其构造器来创建实例。可以使用 getDefault() 或者 getTimeZone() 得到实例。
// getDefault() 方法用于获得运行机器上的默认时区，默认时区可以通过修改操作系统的相关配置来调整；
// getTimeZone() 则根据时区ID来获取对应的时区。

public class TimeZoneDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//获取Java所支持的所有时区ID
		String[] ids = TimeZone.getAvailableIDs();
		System.out.println(Arrays.toString(ids));
		
		TimeZone tz = TimeZone.getDefault();
		//获取系统默认时区的ID
		System.out.println(tz.getID()); //Asia/Shanghai
		System.out.println(tz.getDisplayName()); //China Standard Time
		
		Locale locale = new Locale("zh-CN", "China");
		String lang = locale.getLanguage();
		System.out.println(lang);
		String country = locale.getCountry();
		System.out.println(country);
		
		System.out.println(new Date().toString());
		//使用 SimpleDateFormat 类格式化日期
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

	}

}
