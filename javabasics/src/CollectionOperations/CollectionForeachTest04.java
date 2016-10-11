package CollectionOperations;

import java.util.Collection;
import java.util.HashSet;

public class CollectionForeachTest04 {

	/**
	 * @author Nathan
	 */
	public static void main(String[] args) {
		
		Collection books = new HashSet();
		
		books.add("Splunk大数据开发");
		books.add("Spark大数据开发");
		books.add("Hadoop大数据开发");
		
		
		for(Object obj:books){
			
			String book = (String)obj;
			System.out.println(book);
			
		}
		
		System.out.println(books);

	}

}
