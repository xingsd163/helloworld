package DateOperations;

import java.util.Date;

public class DateDemo01 {

	/**
	 * @@@author Nathan Date类，打印当前时间 时间比较
	 */
	public static void main(String[] args) {

		// java.util.Date 类来封装当前的日期和时间。
		Date date = new Date(); // 构造函数1
		// String toString( ), 转换Date对象为String表示形式，并返回该字符串。
		System.out.println(date.toString());
		// 返回自1970年1月1日以来的毫秒数
		System.out.println(date.getTime());

		long long_date = 1436159501120L;
		Date date02 = new Date(long_date);// 构造函数2
		System.out.println(date02.toString());

		// 日期比较 after(), before(), equals()
		System.out.println(date.after(date02));
		System.out.println(date.before(date02));
		System.out.println(date.equals(date02));

	}

}
