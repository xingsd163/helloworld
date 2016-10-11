package ListDemo;

/**
 * 
 * ArrayList 内部以数组的形式来保存集合中的元素，因此随机访问集合元素时有较好的性能；
 * LinkedList 内部以链表的形式来保存集合中的数据，因此随机访问元素时性能较差，但在插入、删除元素时性能非常出色。
 * 
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class ArrayList01 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		List<String> books = new ArrayList<String>();
		books.add(new String("轻量级Java EE 企业应用实践"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂Android讲义"));
		
		System.out.println(books);
		System.out.println(books.size());
		System.out.println(books.get(0));
		System.out.println(books.get(1));
		System.out.println(books.get(2));
		
		System.out.println(books.indexOf("疯狂Android讲义"));
		System.out.println(books.indexOf(new String("疯狂Android讲义")));
		
		System.out.println("***开始For循环遍历***");
		
		for(int i=0;i<books.size();i++){
			System.out.print(books.get(i)+",");
		}
		
		System.out.println();
		books.remove(1);
		
		System.out.println(books);
		
		books.add(1, new String("疯狂JAVA讲义"));
		//添加新元素时可以指定索引，也可以不指定
		
		System.out.println("***使用 listIterator() 方法开始遍历列表***");
		
		ListIterator<String> lit = books.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		
		
		System.out.println("接下来使用输出流重定向功能将列表输出到文件中");
		
		PrintStream out = System.out; //保存原输出流
		PrintStream ps = new PrintStream(new File("log.txt")); //创建新的输出流
		System.setOut(ps);//设置输出流重定向
		
		ListIterator<String> lit1 = books.listIterator();
		while(lit1.hasNext()){
			System.out.println(lit1.next());
		}
		
		
		
	}

}
