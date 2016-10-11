package DateAndCalendar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 
 * 
 * @author Nathan
 * 
 * 可以使用 System.currentTimeMillis() 方法获取程序的执行时间。
 * 
 * 基于第一个示例改造程序，将结果输出到文件中。
 *
 */

public class currentTimeMillsDemo02 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		long begintime = System.currentTimeMillis();
		System.out.println("程序开始执行...");
		
		long sum=0l;
		PrintStream out=System.out;
		File f = new File("timecost.txt");
		//如果文件存在先删除
		if(f.exists()){
			f.delete();
		}
		PrintStream ps = new PrintStream(f);
		System.setOut(ps);
		
		for(int i=1;i<1000000;i++){
			
			sum+=i;
			System.out.println(sum);
			
		}
		
		
		long endtime=System.currentTimeMillis();
		long time=endtime-begintime;
		System.setOut(out);
		System.out.println("执行完毕！本次程序执行耗时：" + time +"毫秒");

	}

}
