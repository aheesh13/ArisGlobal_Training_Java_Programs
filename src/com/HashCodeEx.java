package com;

import java.util.HashSet;
import java.util.Set;

public class HashCodeEx {

	public static void main(String args[]) {
		Pen1 p1=new Pen1(100,"blue");
		Pen1 p2=new Pen1(100,"blue");
		
	  System.out.println(p1);
	  System.out.println(p2);
	  System.out.println(p1.equals(p2));
		
		
	 Set<Pen1> pens=new HashSet<>();
	 pens.add(p1);
	 pens.add(p2);
		System.out.println(pens);
	}
	
	
	
	
}
 class Pen1 {
	
	int price;
	String color;
	
	public Pen1(int price, String color) {
		super();
		this.price = price;
		this.color = color;
	}
//Object Class is the root of class hierarchy.Every class has Object as super class.

	@Override
	public boolean equals(Object obj) {
		Pen1 that=(Pen1) obj;
		boolean isEqual = this.price == that.price && this.color == that.color;
		return isEqual;
	}
	
    @Override
    public int hashCode() {
    	return price+color.hashCode();
    }
}