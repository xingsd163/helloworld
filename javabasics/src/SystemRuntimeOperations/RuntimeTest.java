package SystemRuntimeOperations;

public class RuntimeTest {

	/**
	 * @author Nathan
	 */
	public static void main(String[] args) {
		
		// 获取 Java 程序关联的运行时对象
		Runtime run = Runtime.getRuntime();
		
		String s5 = "RuntimeTest";
		
		System.out.println("Number of Processors:"+run.availableProcessors());
		System.out.println("Free Memory:" + run.freeMemory());
		System.out.println("Max Memory:" + run.maxMemory());
		
		s5 = null;
		
		Runtime.getRuntime().gc();
		
		System.out.println(s5);
		
		
	}

}
