package DateOperations;

import java.util.*;

public class SimpleDateFormat03 {

	/**
	 * @author Nathan
	 * Thread.sleep(), 休眠
	 * 让程序休眠一毫秒的时间或者到您的计算机的寿命长的任意段时间。例如，下面的程序会休眠10秒
	 * 
	 * second 秒
	 * millisecond 毫秒
	 * microsecond 微秒
	 * 
	 * 秒 >毫秒>微秒，换算单位是1000
	 */
	public static void main(String[] args) {
		
		try {
			System.out.println(new Date().toString());
			Thread.sleep(10000);
			System.out.println(new Date().toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
