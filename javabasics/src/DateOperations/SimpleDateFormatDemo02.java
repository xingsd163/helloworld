package DateOperations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo02 {

	/**
	 * @author Nathan
	 * 將字符串解析爲時間
	 * parse() 按指定格式将字符串解析为Date对象
	 * 按照给定的SimpleDateFormat 对象的格式化存储来解析字符串
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
