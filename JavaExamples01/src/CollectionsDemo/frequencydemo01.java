package CollectionsDemo;


/**
 * 
 * 查找指定列表中出现次数最多的IP地址
 * Collections.frequency() 用于统计指定元素的出现次数
 * HashMap 中key是唯一的，可以用于去除重复值
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class frequencydemo01 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("192.168.0.123");
		al.add("192.178.0.123");
		al.add("192.178.0.123");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.179.0.123");
		al.add("192.179.0.123");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		al.add("192.178.0.122");
		
		
		System.out.println("列表的长度是: "+al.size());
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		int a = Collections.frequency(al, "192.178.0.122");
		System.out.println("IP-122出现的次数是："+a);
		
		for(int i=0;i<al.size();i++){
			
			int times = Collections.frequency(al, (String)al.get(i));
			
			System.out.println((String)al.get(i)+"出现了"+times+"次。");
			
			hm.put(times, (String)al.get(i));
			
		}
		
		System.out.println(hm);
		
		int max = Collections.max(hm.keySet());
		
		System.out.println(max);
		
		String ipaddress = hm.get(max);
		
		System.out.println("出现次数最多的IP地址是 "+ipaddress+"，共出现了"+max+"次！");
		
	}

}
