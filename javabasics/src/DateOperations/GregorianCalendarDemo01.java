package DateOperations;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class GregorianCalendarDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String months[] = {
			      "Jan", "Feb", "Mar", "Apr",
			      "May", "Jun", "Jul", "Aug",
			      "Sep", "Oct", "Nov", "Dec"};
			      
			      int year;
			      // ��ʼ�� Gregorian ����
			      // ʹ�õ�ǰʱ�������
			      // Ĭ��Ϊ����ʱ���ʱ��
			      GregorianCalendar gcalendar = new GregorianCalendar();
			      // ��ʾ��ǰʱ������ڵ���Ϣ
			      System.out.print("Date: ");
			      System.out.print(months[gcalendar.get(Calendar.MONTH)]);
			      System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
			      System.out.println(year = gcalendar.get(Calendar.YEAR));
			      System.out.print("Time: ");
			      System.out.print(gcalendar.get(Calendar.HOUR) + ":");
			      System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
			      System.out.println(gcalendar.get(Calendar.SECOND));
			      
			      // ���Ե�ǰ����Ƿ�Ϊ����
			      if(gcalendar.isLeapYear(year)) {
			         System.out.println("��ǰ���������");
			      }
			      else {
			         System.out.println("��ǰ��ݲ�������");
			      }
			   }
			}