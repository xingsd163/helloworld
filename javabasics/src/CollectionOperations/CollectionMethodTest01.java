package CollectionOperations;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethodTest01 {

	/**
	 * @author Nathan
	 */
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		if(c1.isEmpty()){
			System.out.println("c1���ϵ�ǰΪ��");
		}
		String s1 = new String("�����");
		c1.add(s1);
		//��Ȼ�����ﲻ�ܷŻ������͵�ֵ���� Java ֧���Զ�װ��
		c1.add(6);
		
		System.out.println(c1);
		
		System.out.println("���� c1��Ԫ�ظ�����" + c1.size());
		
		//ɾ��ָ��Ԫ��
		c1.remove(6);
		System.out.println("���� c1��Ԫ�ظ�����" + c1.size());
		
		if(c1.contains("�����")){
			System.out.println("����c1��ǰ���������");
		}
		else{
			System.out.println("����c1��ǰ�����������");
		}
		
		c1.clear();
		System.out.println("���� c1��Ԫ�ظ�����" + c1.size());
		
		if(c1.isEmpty()){
			System.out.println("c1���ϵ�ǰΪ��");
		}
	}

}
