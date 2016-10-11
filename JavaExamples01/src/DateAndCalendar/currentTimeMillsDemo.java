package DateAndCalendar;
/**
 * 
 * 
 * @author Nathan
 * 
 * 可以使用 System.currentTimeMillis() 方法获取程序的执行时间。
 *
 * 打印流：PrintStream、PrintWriter
 * 标准输出流是字节类型的
 *
 */

public class currentTimeMillsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long begintime = System.currentTimeMillis();
		long sum=0l;
		for(int i=1;i<1000000;i++){
			
			sum+=i;
			System.out.println(sum);
			
		}
		
		
		long endtime=System.currentTimeMillis();
		long time=endtime-begintime;
		System.out.println("本次程序执行耗时" + time +"毫秒");

	}

}
