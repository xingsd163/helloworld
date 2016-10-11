package DateOperations;

import java.util.Calendar;

public class CalendarDemo01 {

	/**
	 * @author Nathan
	 * Calendar类，获取日期数据的特定部分，比如说小时，日，或者分钟
	 * Calendar类的功能要比Date类强大很多，而且在实现方式上也比Date类要复杂一些。
	 * Calendar类是一个抽象类，在实际使用时实现特定的子类的对象，创建对象的过程对程序员来说是透明的，只需要使用getInstance方法创建即可。
	 */
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)); //年
		System.out.println(c.get(Calendar.MONTH)+1);//月
		System.out.println(c.get(Calendar.DATE)); //日期
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //日期
		System.out.println(c.get(Calendar.HOUR)); //12小时制的小时
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); //24小时制的小时
		System.out.println(c.get(Calendar.MINUTE));//分钟
		System.out.println(c.get(Calendar.SECOND));//秒
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//星期几，（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
		
		//Calendar.set() 可用于设置日期
	}

}
