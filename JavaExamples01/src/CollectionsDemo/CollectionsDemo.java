package CollectionsDemo;

/**
 * 
 * 
 * @author Nathan
 * 
 * Java 提供了一个操作 Set、List、Map等集合的工具类： Collections，该工具类提供了大量的方法对集合元素进行排序、查找和修改等操作。
 * 还提供了将集合设置为不可变、对集合对象实现同步访问的方法。
 * 
 * 
 * 对 List 集合进行排序的类：
 * static void reverse(List list): 反转指定 LIST 集合中元素的顺序。
 * static void shuffle(List list): 对List集合元素进行随机排序，类似洗牌的动作
 * static void sort(List list): 根据元素的自然顺序对指定list集合的元素按升序进行排序。
 * static void sort(List list,Comparator c): 根据 Comparator 产生的顺序对list集合进行排序
 * static void swap(List list,int i,int j): 将 i 和 j 进行交换
 * 
 * 
 * 
 * 替换查找操作
 * static int binarySearch(List list, Object key): 使用二分法查看搜索制定的list集合，获得该对象在list中的索引。
 * 要使该方法可以正常工作，必须保证list中的元素处于有序状态。
 * static Object max(Collection col)， 根据元素的自然顺序，返回最大元素
 * static Object max(Collection col, Comparator c)
 * static Object min(Collection col):
 * static void fill(List list,Object obj): 使用指定元素 obj 替换指定 list 集合中的所有元素
 * static int frequency(Collection c, Object obj): 返回指定元素出现的频度
 * static int indexOfSubList(List source,List Large)
 * 
 * static boolean replaceAll(List list,Object oldVal, Object newVal), 使用旧值替换所有新值
 *
 * 
 * 
 * 
 * 
 * 同步控制
 * 
 * Collections 类中提供了多个 synchronizedXxx() 方法，可以将指定集合包装成线程同步的集合，从而可以解决多线程并发访问集合时的线程安全问题。
 * 
 * HashSet, TreeSet, ArrayList, ArrayDeque, LinkedList, HashMap, TreeMap 都是线程不安全的。
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 */

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
