package DateOperations;

import java.util.*;

public class DiffDemo01 {

	/**
	 * @author Nathan
	 * ����ʱ�������Ժ���Ϊ��λ��
	 * ���������������ִ��ʱ��
	 * 
	 * System.currentTimeMillis()
	 */
	public static void main(String[] args) {
		
		try {
			//��ʼʱ��
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			Thread.sleep(10*1000);
			//����ʱ��
			long end = System.currentTimeMillis();
			System.out.println(new Date());
			
			long diff=end - start;
			System.out.println(diff+"����");
			System.out.println(diff/1000+"��");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
