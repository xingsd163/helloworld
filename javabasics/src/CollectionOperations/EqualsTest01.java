package CollectionOperations;

public class EqualsTest01 {
	
	public static void main(String[] args){
		
		String h1 = new String("hehe");
		String h2 = new String("hehe");
		
		// == �ǻ����ڴ��ַ���бȽ�
		// �ܶ����͵� equals() �����ѱ���д������ֵ���бȽ�
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
