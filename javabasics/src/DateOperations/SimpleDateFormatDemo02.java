package DateOperations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo02 {

	/**
	 * @author Nathan
	 * ���ַ����������r�g
	 * parse() ��ָ����ʽ���ַ�������ΪDate����
	 * ���ո�����SimpleDateFormat ����ĸ�ʽ���洢�������ַ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String date02="02-02-1987";
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		try {
			Date mydate = sdf.parse(date02);
			System.out.println(mydate.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
