package CollectionOperations;

import java.util.Collection;
import java.util.HashSet;

public class CollectionForeachTest04 {

	/**
	 * @author Nathan
	 */
	public static void main(String[] args) {
		
		Collection books = new HashSet();
		
		books.add("Splunk�����ݿ���");
		books.add("Spark�����ݿ���");
		books.add("Hadoop�����ݿ���");
		
		
		for(Object obj:books){
			
			String book = (String)obj;
			System.out.println(book);
			
		}
		
		System.out.println(books);

	}

}
