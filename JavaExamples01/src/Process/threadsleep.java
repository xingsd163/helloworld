package Process;

public class threadsleep extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		
		threadsleep ts = new threadsleep();
		ts.start();
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		System.out.println("程序开始。。。");
		Thread.sleep(2000);
		System.out.println("已经执行2秒。。。");
		Thread.sleep(2000);
		System.out.println("已经执行4秒。。。");
		Thread.sleep(10000);
		System.out.println("程序结束");
		
	
		}
	}


