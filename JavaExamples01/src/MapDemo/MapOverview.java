package MapDemo;


/**
 * 
 * @author Nathan
 * 
 * Map用于保存具有映射关系的数据，因此Map集合里保存着两组值，一组用于保存Map里的key，一组值用于保存Map里的Value。
 * Map的key不允许重复。
 * Map有时也被称为字段，或关联数组。
 * 
 * 主要的方法：
 * 
 * void clear(), 清空Map
 * Object get(Object key)
 * Object put(Object key, Object value)
 * int size()
 * boolean containsKey(Object key)
 * 
 * 
 * HashMap 和 Hashtable 都是 Map 接口的典型实现类。
 * Hashtable 是一个古老的 Map 实现类
 * 
 * Hashtable 是一个线程安全类，HashMap是线程不安全的实现类，但 HashMap的性能高一点。
 * 
 * 与 Vector 类似的是，尽量少用 Hashtable 类，即使需要创建线程安全的 MAP实现类，也无须使用 Hashtable 实现类，可以通过 Collections 工具类把 HashMap 变成线程安全的。
 * 
 * Map 中顺序无法保证。
 * 
 * 判断两个key相等的标准是：两个key通过equals()方法比较返回true，两个key的 hashCode值也相等。
 *
 *
 * 
 * 
 * 
 *
 */

public class MapOverview {

}
