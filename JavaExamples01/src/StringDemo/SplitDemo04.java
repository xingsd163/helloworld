package StringDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Nathan
 * 
 *         使用 String 的 split() 方法分割字符串 字符串之间使用tab (\t) 分割
 *         读取文件并以json格式写入到文件中
 * 以json形式输出
 */

public class SplitDemo04 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
		
		//PrintWriter 要写在循环外部，如果写在while循环里，则每次循环都会创建新文件，最后只输出最后一条记录
		PrintWriter out
		   = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));
		
		try {

			String line;
			while ((line = br.readLine()) != null) {
				
				String[] stringtokens = line.split(",");

				String name = stringtokens[0];
				String sex = stringtokens[1];
				int age = Integer.parseInt(stringtokens[2]);
				String province = stringtokens[3];
				String education = stringtokens[4];
				String career = stringtokens[5];
					
				//输出内容
				String output = "姓名:"+name+",性别:"+sex+",年龄:"+age+",籍贯:"+province+",学历:"+education+",职业:"+career;
				
				//输出到文件
				out.write(output);
				out.println();
				

			}

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//下面两个方法必须写在循环外
		out.flush();
		out.close();
		System.out.println("输出完成！");

	}

}
