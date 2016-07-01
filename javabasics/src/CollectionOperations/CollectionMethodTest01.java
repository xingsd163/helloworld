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
			System.out.println("c1集合当前为空");
		}
		String s1 = new String("孙悟空");
		c1.add(s1);
		//虽然集合里不能放基本类型的值，但 Java 支持自动装箱
		c1.add(6);
		
		System.out.println(c1);
		
		System.out.println("集合 c1的元素个数：" + c1.size());
		
		//删除指定元素
		c1.remove(6);
		System.out.println("集合 c1的元素个数：" + c1.size());
		
		if(c1.contains("孙悟空")){
			System.out.println("集合c1当前包含孙悟空");
		}
		else{
			System.out.println("集合c1当前不包含孙悟空");
		}
		
		c1.clear();
		System.out.println("集合 c1的元素个数：" + c1.size());
		
		if(c1.isEmpty()){
			System.out.println("c1集合当前为空");
		}
	}

}
