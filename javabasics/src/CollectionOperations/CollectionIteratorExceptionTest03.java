package CollectionOperations;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionIteratorExceptionTest03 {

	/**
	 * @author Nathan
	 */
	public static void main(String[] args) throws Exception{
		
		Collection books = new HashSet();
		
		books.add("Splunk�����ݿ���");
		books.add("Spark�����ݿ���");
		books.add("Hadoop�����ݿ���");
		
		Iterator it = books.iterator();
		
		while(it.hasNext()){
			String book = (String)it.next();
			System.out.println(book);
			
			if(book.equals("Hadoop�����ݿ���")){
				books.remove(book);
			}
			
			
		}
		
		System.out.println(books);

	}

}
