package StringDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Nathan
 * 
 *         使用 String 的 split() 方法分割字符串 字符串之间使用tab (\t) 分割
 * 以json形式输出
 */

public class SplitDemo03 {

	public static void main(String[] args) throws IOException {

		String line = "小李,男,27,山東,大學專科,工程師";

		String[] stringtokens = line.split(",");

		String name = stringtokens[0];
		String sex = stringtokens[1];
		int age = Integer.parseInt(stringtokens[2]);
		String province = stringtokens[3];
		String education = stringtokens[4];
		String career = stringtokens[5];
		
		//输出到控制台
		System.out.println("姓名:"+name+",性别:"+sex+",年龄:"+age+",籍贯:"+province+",学历:"+education+",职业:"+career);
			
		//输出到文件
		String output = "姓名:"+name+",性别:"+sex+",年龄:"+age+",籍贯:"+province+",学历:"+education+",职业:"+career;
		
		FileWriter fw = new FileWriter(new File("jsonout.txt"));
		fw.write(output);
		fw.flush();
		System.out.println("输出完成！");
	}

}
