package RandomDemo;

import java.text.DecimalFormat;

public class randomdemo01 {
	
	public static void main(String[] args) {
		
		//2的一次幂，返回类型是 double
		System.out.println(Math.pow(2, 1));
		
		//Math 的求最大值函数
		System.out.println(Math.max(100, 1000));
		
		
		//用于格式化数值
		DecimalFormat df = new DecimalFormat();
		//设置最低小数位数
		df.setMinimumFractionDigits(0);
		
		double a = Math.pow(2, 1);
		
		//format() 方法返回String类型的值
		String b=df.format(a);
		
		System.out.println(Integer.parseInt(b));
		
		
		//Math 的 random() 方法，还有一个 java.util.Random 类
		System.out.println(Math.random());
	}

}
