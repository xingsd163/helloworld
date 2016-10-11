package SystemRuntimeOperations;

/**
 * 
 * @author Nathan
 * 
 * hashCode() - ���ض���� hashCode ֵ��int ���ͣ�����Ĭ������£�Object ��� hashCode() �������ݸö���ĵ�ַ�����㣨����
 * System.identifyHashCode(Object x) �����ļ�������ͬ�������Ǻܶ��඼��д�� Object ��� hashCode() ���������ٸ��ݵ�ַ�������� hashCode() ����ֵ
 * ���磬String �����д���� hashCode() ��������Ϊ�����ַ������м��� hashCode ֵ
 * identifyHashCode()
 *
 *
 */

public class IdentifyHashCodeDemo01 {

	public static void main(String[] args) {
		
		//s1 �� s2 ��������ͬ�Ķ��󣬵�ֵ��ͬ
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		// String ��д�� hashCode() ���� - ��Ϊ�����ַ����м��� hashCode ֵ
		// ��Ϊ s1 �� s2 ���ַ�������ͬ���������ǵ� hashCode() ��������ֵ��ͬ
		System.out.println("s1\'s hascode:"+ s1.hashCode());
		System.out.println("s2\'s hascode:"+ s2.hashCode());
		
		// s1 �� s2 �ǲ�ͬ���ַ��������������ǵ� identifyHashCode ֵ��ͬ��
		System.out.println("s1\'s identifyHashCode:"+ System.identityHashCode(s1));
		System.out.println("s2\'s identifyHashCode:"+ System.identityHashCode(s2));
		
		String s3 = "Java";
		String s4 = "Java";
		
		// s3 �� s4 ����ͬ���ַ��������������ǵ� identifyHashCode ֵ��ͬ
		System.out.println("s3\'s identifyHashCode:"+ System.identityHashCode(s3));
		System.out.println("s4\'s identifyHashCode:"+ System.identityHashCode(s4));

	}

}
