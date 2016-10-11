package CollectionOperations;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
	
	public static void main(String[] args){
		Set books = new HashSet();
		books.add(new String("Splunk大数据开发"));
		boolean result = books.add(new String("Splunk大数据开发"));
		
		System.out.println(result + "-->" + books);
		
	}

}
