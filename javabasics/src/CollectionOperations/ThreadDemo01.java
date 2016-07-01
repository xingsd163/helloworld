package CollectionOperations;

public class ThreadDemo01 {

	public static void run() {
		for (int row = 1000; row >0; row--) {

			for (int i = 0; i <row; i++) {

				System.out.print("*");

			}

			System.out.println();

		}
	}

	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		ThreadDemo01.run();
		long b = System.currentTimeMillis();
		
		System.out.println(b-a);

	}

}
