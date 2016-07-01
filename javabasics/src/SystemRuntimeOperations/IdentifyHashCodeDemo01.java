package SystemRuntimeOperations;

/**
 * 
 * @author Nathan
 * 
 * hashCode() - 返回对象的 hashCode 值（int 类型）。在默认情况下，Object 类的 hashCode() 方法根据该对象的地址来计算（即与
 * System.identifyHashCode(Object x) 方法的计算结果相同）。但是很多类都重写了 Object 类的 hashCode() 方法，不再根据地址来计算其 hashCode() 方法值
 * 例如，String 类就重写了其 hashCode() 方法，改为根据字符串序列计算 hashCode 值
 * identifyHashCode()
 *
 *
 */

public class IdentifyHashCodeDemo01 {

	public static void main(String[] args) {
		
		//s1 和 s2 是两个不同的对象，但值相同
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		// String 重写了 hashCode() 方法 - 改为根据字符序列计算 hashCode 值
		// 因为 s1 和 s2 的字符序列相同，所以它们的 hashCode() 方法返回值相同
		System.out.println("s1\'s hascode:"+ s1.hashCode());
		System.out.println("s2\'s hascode:"+ s2.hashCode());
		
		// s1 和 s2 是不同的字符串对象，所以它们的 identifyHashCode 值不同。
		System.out.println("s1\'s identifyHashCode:"+ System.identityHashCode(s1));
		System.out.println("s2\'s identifyHashCode:"+ System.identityHashCode(s2));
		
		String s3 = "Java";
		String s4 = "Java";
		
		// s3 和 s4 是相同的字符串对象，所有它们的 identifyHashCode 值相同
		System.out.println("s3\'s identifyHashCode:"+ System.identityHashCode(s3));
		System.out.println("s4\'s identifyHashCode:"+ System.identityHashCode(s4));

	}

}
