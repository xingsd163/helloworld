package DateOperations;

/**
 * �Ը�ʽ����ʽ��ӡ��ǰʱ��
 * @@author Nathan
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo01 {

	public static void main(String[] args) {

		Date today = new Date();
		// ��ʽ����ǰʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// java.text.SimpleDateFormat.format() ��������ʽ�����ں�ʱ��
		String current_time = sdf.format(today);
		System.out.print(current_time);

	}

}
