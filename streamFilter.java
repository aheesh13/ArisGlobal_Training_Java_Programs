package com;
import java.util.*;
public class streamFilter {
public static void main(String args[]) {
	List<String> ls=Arrays.asList("Abc","","","","abcde");
	
	
	//passes each element in list one by one and filters by checking empty condition for each elements and returns the
	//count of all empty elements.
	long count=ls.stream().filter(s->s.isEmpty()).count();
	System.out.println(count);
}
	
	
	
}
