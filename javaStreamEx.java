package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class javaStreamEx {
public static void main(String args[]) {
	List<String> ls=new ArrayList<String>();
	ls.add("abc");
	ls.add("www");
	ls.add("eee");
	ls.add("iii");
	ls.forEach(System.out::println);
	//ls.stream distributes the data and map converts each string to uppercase using lamda expression.
	//Collectors collect the distributed data and reforms the list.
	//We will take a new list to store these collected data and print.
	List<String>ls1=ls.stream().map((s)->s.toUpperCase()).collect(Collectors.toList());
	ls1.forEach(System.out::println);
}
}
