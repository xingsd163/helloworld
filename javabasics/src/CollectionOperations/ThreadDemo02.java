package CollectionOperations;

import java.lang.Thread;

public class ThreadDemo02 extends Thread{

	@Override
	public void run() {
		for (int row = 10; row >0; row--) {

			for (int i = 0; i <row; i++) {

				System.out.print("a");

			}

			System.out.println();

		}
	}

	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		System.out.println(a);
		ThreadDemo02 td1 = new ThreadDemo02();
		ThreadDemo02 td2 = new ThreadDemo02();
		ThreadDemo02 td3 = new ThreadDemo02();
		td1.start();
		td2.start();
		td3.start();
		long b = System.currentTimeMillis();
		System.out.println(b);
		System.out.println(b-a);

	}

}
