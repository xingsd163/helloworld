package CollectionOperations;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
	
	public static void main(String[] args){
		Set books = new HashSet();
		books.add(new String("Splunk�����ݿ���"));
		boolean result = books.add(new String("Splunk�����ݿ���"));
		
		System.out.println(result + "-->" + books);
		
	}

}
