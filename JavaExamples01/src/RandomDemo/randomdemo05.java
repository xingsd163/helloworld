package RandomDemo;

/**
 * 
 * 随机生成100万条耗时313毫秒
 * 200万耗时641毫秒
 * 
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.xml.datatype.Duration;

/**
 * 
 * @author Nathan
 * 
 *
 */

public class randomdemo05 {
	
	public static void main(String[] args) throws IOException {
		
		String[] names = new String[16];
		names[0]="德玛西亚";
		names[1]="诺克萨斯";
		names[2]="战争学院";
		names[3]="皮城警备";
		names[4]="艾欧尼亚";
		names[5]="怒瑞玛";
		names[6]="班德尔城";
		names[7]="皮尔特沃夫";
		names[8]="黑色玫瑰";
		names[9]="暗影岛";
		names[10]="钢铁烈阳";
		names[11]="暗影岛";
		names[12]="无畏先锋";
		names[13]="扭曲丛林";
		names[14]="征服之海";
		names[15]="弗雷尔卓德";
		
		//System.out.println(names[1].toString());
		
		int times=20000;
		
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<times;i++){
			//不包括16
			int num = new Random().nextInt(16);
			sb.append(names[num]+"\n");
		}
		
		System.out.println(sb);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("lolregions.txt")));
		pw.print(sb);
		pw.flush();
		pw.close();
		
		long end = System.currentTimeMillis();
		long duration = end - start;
		
		System.out.println("输出完成!");
		System.out.println("耗时: "+duration);
		
		
		
	}
	
	

}
