package RegexDemo;

/**
 * @author Nathan
 * Java 正则表达式示例
 * 从日志中提取一个字段
 * 从日志中一次提取多个字段
 * 
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo01 {
	public static void main(String[] args) {
		
		System.out.println("示例1");
		//验证数字
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("hkjsd@163.com");
		//是否匹配到，返回true
		//System.out.println(m.find());
		
		Boolean boolean1 = m.find();
		
		if (boolean1==true) {
			System.out.println("true\n已匹配到对应字符串");
		}
		//返回匹配到的子字符串，Returns the input subsequence matched by the previous match. 
		System.out.println(m.group());
		
		
		System.out.println("****************************");
	
		
		//从日志中提取IP地址
		System.out.println("示例2");
		String ip1 = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";  
		//此正则可判断IP是否合法
		String ip2 = "\\b((25[0–5]|2[0–4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0–5]|2[0–4]\\d|[01]?\\d\\d?)\\b";
		Pattern p1 = Pattern.compile(ip2);
		Matcher m1 = p1.matcher("255.82.2.33,2015-07-09,Nathan,http://baidu.com,33");
		System.out.println(m1.find());
		System.out.println(m1.group());
		
		System.out.println("****************************");
		
		//判断手机号码
		System.out.println("示例3");
		String mobile = "((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}";
		Pattern p3 = Pattern.compile(mobile);
		Matcher m3 = p3.matcher("255.82.2.33,2015-07-09,Nathan,13782838483,http://baidu.com,33");
		System.out.println(m3.find());
		System.out.println(m3.group());
		
		
		System.out.println("****************************");
		
		//从日志中一次提取两个字段
		System.out.println("示例4");
		String mobile003="((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}";
		String ip003 = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
		//分隔符逗号
		String mobile2 = "("+ip003+"),("+mobile003+")";
		//分隔符空格
		//String mobile2 = "("+ip003+"),("+mobile003+")";
		Pattern p4 = Pattern.compile(mobile2);
		//Matcher m4 = p4.matcher("255.82.2.33,13782838483");
		Matcher m4 = p4.matcher("255.82.2.33,13782838483");
		System.out.println(m4.find());
		//System.out.println(m4.groupCount());
		System.out.println(m4.group(1));
		System.out.println(m4.group(2));
		System.out.println("****************************");
		
		
		//从日志中一次提取三个字段
		
		System.out.println("示例5");
		String mobile004="((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}";
		String ip004 = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
		String str004 = ",\\w+,";
		String regex003 = "("+ip004+")("+str004+")("+mobile004+")";
		Pattern p5 = Pattern.compile(regex003);
		Matcher m5 = p5.matcher("255.82.2.33,Nathan,13782838483");
		System.out.println(m5.find());
		System.out.println(m5.group(1));
		//虽然匹配到第二个字段，但我们只需要第一和第三个字段
		System.out.println(m5.group(2));
		System.out.println(m5.group(3));
		
		
		
		
	}

}
