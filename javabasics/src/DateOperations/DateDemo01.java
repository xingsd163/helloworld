package DateOperations;

import java.util.Date;

public class DateDemo01 {

	/**
	 * @@@author Nathan Date�࣬��ӡ��ǰʱ�� ʱ��Ƚ�
	 */
	public static void main(String[] args) {

		// java.util.Date ������װ��ǰ�����ں�ʱ�䡣
		Date date = new Date(); // ���캯��1
		// String toString( ), ת��Date����ΪString��ʾ��ʽ�������ظ��ַ�����
		System.out.println(date.toString());
		// ������1970��1��1�������ĺ�����
		System.out.println(date.getTime());

		long long_date = 1436159501120L;
		Date date02 = new Date(long_date);// ���캯��2
		System.out.println(date02.toString());

		// ���ڱȽ� after(), before(), equals()
		System.out.println(date.after(date02));
		System.out.println(date.before(date02));
		System.out.println(date.equals(date02));

	}

}
