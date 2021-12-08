package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Customer{
	@Override
	public String toString() {
		return "Customer [name=" + name + ", points=" + points + "]";
	}
	public Customer(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	String name;
	int points;
}
public class streamMethodsEx {
 public static void main(String args[]) {
	 Customer a=new Customer("kevin K.",30);
		Customer b=new Customer("Jhon",150);
		Customer c=new Customer("Andrew",80);
		Customer d=new Customer("Flash",800);
		Customer e=new Customer("Kumar Kishan.",1200);
		List<Customer> c1=new ArrayList<Customer>();
		c1.add(a);
		c1.add(b);
		c1.add(c);
		c1.add(d);
		c1.add(e);
		//customers.forEach(System.out::print);
	List<Customer> c2 = c1.stream().map(l->new Customer(l.getName().toLowerCase(),l.getPoints()*2))
				.filter(l->l.getPoints()>100 && l.getName().startsWith("j")).collect(Collectors.toList());
		c2.forEach(System.out::println);
		
		
 }
	
	
}
