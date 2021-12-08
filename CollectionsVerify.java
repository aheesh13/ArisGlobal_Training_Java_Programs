package com;
import java.util.*;

public class CollectionsVerify {

	
	public static void main(String[] agrgs) {
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("asd");
		ls.add("dfg");
		ls.add("jjk");
		Collections.sort(ls);
		
		System.out.println(ls);
		
		PriorityQueue<String> pb=new PriorityQueue<String>();
		pb.add("abc");
		pb.add("abc");
		pb.add("hhs");
		pb.add("jdjf");
		System.out.println(pb);
		
		
		
	   HashSet<Integer> la=new HashSet<Integer>();
	                la.add(10);
	                la.add(20);
	                la.add(10);
	                la.add(30);
	                la.add(40);
	                la.add(50);
	                System.out.println(la);
	        Iterator<Integer> itr=la.iterator();
	        while(itr.hasNext()){
	        	int i=(Integer) itr.next();
	        	System.out.println(i + " ");
	        }
	

	  
	
	 TreeSet<Integer> ta=new TreeSet<Integer>();
	        ta.add(100);
	        ta.add(1000);
	        ta.add(10);
	        ta.add(100);
	        ta.add(1);
	        ta.add(2);
	        ta.add(3);
	        ta.add(4);
	        ta.remove(1);
	        System.out.println(ta);
	
	
	 Map map=new HashMap();
	 map.put(2,"abc");
	 map.put(3, "efg");
	 map.put(1, "yyu");
	 System.out.println(map);
	 Set set=map.entrySet();
	 Iterator itr1=set.iterator();
	 while(itr1.hasNext()) {
		 Map.Entry entry=(Map.Entry)itr1.next();
		 System.out.println(entry.getKey()+" "+entry.getValue());
	 }
	        
	}	
}
