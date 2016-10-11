package StringDemo;

/**
 * 
 * @author Nathan
 * 
 *         使用 String 的 split() 方法分割字符串 字符串之间使用tab (\t) 分割
 *
 */

public class SplitDemo01 {

	public static void main(String[] args) {

		String line = "中国\t人民\t非常苦";
		String line2 = "你好,你好吗,你真好吗";

		String[] stringtokens = line.split("\t");
		String[] stringtokens2 = line2.split(",");

		for (String stringtoken : stringtokens) {

			System.out.println(stringtoken);

		}

		System.out.println("***************");

		for (String stringtoken2 : stringtokens2) {
			System.out.println(stringtoken2);
		}
	}

}
