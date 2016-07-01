package DateOperations;

/**
 * 以格式化方式打印当前时间
 * @@author Nathan
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo01 {

	public static void main(String[] args) {

		Date today = new Date();
		// 格式化当前时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// java.text.SimpleDateFormat.format() 方法，格式化日期和时间
		String current_time = sdf.format(today);
		System.out.print(current_time);

	}

}
