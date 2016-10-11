package RandomDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * 
 * @author Nathan
 * 
 *         生成7位数的随机数 如果生成的数字不足7位，前缀补0
 * 
 *         打印到控制台 保存到外部文件
 * 
 *
 */

public class randomDemo03 {
	public static void main(String[] args) throws IOException {
		int times = 200;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < times; i++) {
			int num = new Random().nextInt((int) (Math.pow(10, 7)));

			// 转换为字符串类型
			String lunknum = "" + num;

			// 生成的数字可能是1位、2位、3位、4位、5位、6位、7位
			// 如果样本较少，可能都是7位或6位，样本多了就会看到不同长度的数字
			/*
			 * //不足7位，前缀补0
			 * 
			 * if(lunknum.length()<7){
			 * 
			 * lunknum="0"+lunknum;
			 * 
			 * }
			 */

			int length = lunknum.length();

			switch (length) {
			case 1: {
				lunknum = "000000" + lunknum;
				break;
			}

			case 2: {
				lunknum = "00000" + lunknum;
				break;
			}

			case 3: {
				lunknum = "0000" + lunknum;
				break;
			}

			case 4: {
				lunknum = "000" + lunknum;
				break;
			}

			case 5: {
				lunknum = "00" + lunknum;
				break;
			}

			case 6: {
				lunknum = "0" + lunknum;
				break;
			}

			default:
				break;
			}

			sb.append(lunknum + "\n");
		}

		System.out.println(sb);

		// 输出到外部文件
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(
				"random.txt")));

		pw.append(sb);
		pw.flush();
		pw.close();

	}

}
