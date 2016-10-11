package SystemRuntimeOperations;

public class RuntimeTest {

	/**
	 * @author Nathan
	 */
	public static void main(String[] args) {
		
		// ��ȡ Java �������������ʱ����
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
