package DateOperations;

import java.util.*;

public class DiffDemo01 {

	/**
	 * @author Nathan
	 * 测量时间间隔（以毫秒为单位）
	 * 可用于评估程序的执行时间
	 * 
	 * System.currentTimeMillis()
	 */
	public static void main(String[] args) {
		
		try {
			//开始时间
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			Thread.sleep(10*1000);
			//结束时间
			long end = System.currentTimeMillis();
			System.out.println(new Date());
			
			long diff=end - start;
			System.out.println(diff+"毫秒");
			System.out.println(diff/1000+"秒");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
