package DateOperations;

import java.util.Calendar;

public class CalendarDemo01 {

	/**
	 * @author Nathan
	 * Calendar�࣬��ȡ�������ݵ��ض����֣�����˵Сʱ���գ����߷���
	 * Calendar��Ĺ���Ҫ��Date��ǿ��ܶ࣬������ʵ�ַ�ʽ��Ҳ��Date��Ҫ����һЩ��
	 * Calendar����һ�������࣬��ʵ��ʹ��ʱʵ���ض�������Ķ��󣬴�������Ĺ��̶Գ���Ա��˵��͸���ģ�ֻ��Ҫʹ��getInstance�����������ɡ�
	 */
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)); //��
		System.out.println(c.get(Calendar.MONTH)+1);//��
		System.out.println(c.get(Calendar.DATE)); //����
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //����
		System.out.println(c.get(Calendar.HOUR)); //12Сʱ�Ƶ�Сʱ
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); //24Сʱ�Ƶ�Сʱ
		System.out.println(c.get(Calendar.MINUTE));//����
		System.out.println(c.get(Calendar.SECOND));//��
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//���ڼ�����ע�⣨�����Date���ǲ�ͬ�ģ���1���������ա�2��������1��3�������ڶ����Դ����ƣ�
		
		//Calendar.set() ��������������
	}

}
