package DateOperations;

import java.util.*;

public class SimpleDateFormat03 {

	/**
	 * @author Nathan
	 * Thread.sleep(), ����
	 * �ó�������һ�����ʱ����ߵ����ļ�������������������ʱ�䡣���磬����ĳ��������10��
	 * 
	 * second ��
	 * millisecond ����
	 * microsecond ΢��
	 * 
	 * �� >����>΢�룬���㵥λ��1000
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
