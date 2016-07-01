package CollectionOperations;

public class EqualsTest01 {
	
	public static void main(String[] args){
		
		String h1 = new String("hehe");
		String h2 = new String("hehe");
		
		// == 是基于内存地址进行比较
		// 很多类型的 equals() 方法已被重写，基于值进行比较
		System.out.println(h1==h2);
		System.out.println(h1.equals(h2));
		
		String h3 = "hehe";
		String h4 = "hehe";
		
		System.out.println(h3==h4);
		System.out.println(h3.equals(h4));
		
		System.out.println(h3==h1);
		System.out.println(h3.equals(h1));
		System.out.println("hehe");
		
	}

}
