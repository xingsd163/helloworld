package StringDemo;
/**
 * 读取文件使用 BufferedReader 和 FileReader
 * 利用 BufferedReader 的 readLine() 方法一行一行读取数据
 * 判断是否读完： while ((line = br.readLine()) != null) 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SplitDemo02 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("employee.txt"));

		try {

			String line;
			while ((line = br.readLine()) != null) {

				String[] stringtokens = line.split(",");
				for (String stringtoken : stringtokens) {
					System.out.print(stringtoken + "\t");
				}
				System.out.println();

			}

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
}
