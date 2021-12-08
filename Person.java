package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class nameComparator implements Comparator{
	@Override
	public int compare(Object p, Object p1) {
	// TODO Auto-generated method stub
	pojo s1=(pojo)p;
	pojo s2=(pojo)p1;
    return (s1.getLast_name().compareTo(s2.getLast_name()));	
}
}	



class pojo{
	@Override
	public String toString() {
		return "pojo [first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	public pojo(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	String first_name;
	String last_name;

}




public class Person {
	public static void main(String args[]) {
		pojo p=new pojo("aheesh","bharadwaj");
		pojo p1=new pojo("xwe","cbc");
		pojo p2=new pojo("ert","chjc");
		pojo p3=new pojo("yuir","cdfc");
		
		
	 List<pojo> ls=new ArrayList<pojo>();
	   ls.add(p1);
	   ls.add(p);
	   ls.add(p3);
	   ls.add(p2);
	   Collections.sort(ls,new nameComparator());
	  // Collections.sort(ls,Collections.reverseOrder());
	  System.out.println(ls);
	  
	  Person dln=new Person();
	  dln.displayLName(ls);
	}

	public void displayLName(List<pojo>ls) {
		   String letter="c";
		   for(pojo i:ls) {
			   if(i.getLast_name().startsWith(letter)) {
				   System.out.println(i);
			   }
		   }
	   }
		
	    
}
	
	
	

