package RandomDemo;

import java.util.Random;

/**
 * 
 * @author Nathan
 * 
 * 生成伪随机数
 *
 */

public class randomdemo02 {

	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println(rd.nextBoolean());
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextInt());
		System.out.println(rd.nextLong());
		//100以内
		System.out.println(rd.nextInt(100));
		//200以内
		System.out.println(rd.nextInt(200));
		//50以内
		System.out.println(rd.nextInt(50));
		//20以内
		System.out.println(rd.nextInt(20));
	}
}
