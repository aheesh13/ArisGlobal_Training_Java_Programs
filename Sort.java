package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class brandComparator implements Comparator{
	@Override
	public int compare(Object pen1, Object pen2) {
	// TODO Auto-generated method stub
	Pen s1=(Pen)pen1;
	Pen s2=(Pen)pen2;
    return (s1.getBrandname().compareTo(s2.getBrandname()));	
}
}	
	
	class priceComparator implements Comparator{
		@Override
		public int compare(Object pen1, Object pen2) {
		// TODO Auto-generated method stub
		Pen s1=(Pen)pen1;
		Pen s2=(Pen)pen2;
	    if(s1.getPrice()==s2.getPrice()) {
	    	return 0;
	    }else if(s1.getPrice()>s2.getPrice()) {
	    	return 1;
	    }else {
	    	return -1;
	    }
	}
	}
  

	class lengthComparator implements Comparator{
		@Override
		public int compare(Object pen1, Object pen2) {
		// TODO Auto-generated method stub
		Pen s1=(Pen)pen1;
		Pen s2=(Pen)pen2;
	    if(s1.getLength()==s2.getLength()) {
	    	return 0;
	    }else if(s1.getLength()>s2.getLength()) {
	    	return 1;
	    }else {
	    	return -1;
	    }
	}
	}
	
	class heightComparator implements Comparator{
		@Override
		public int compare(Object pen1, Object pen2) {
		// TODO Auto-generated method stub
		Pen s1=(Pen)pen1;
		Pen s2=(Pen)pen2;
	    if(s1.getHeight()==s2.getLength()) {
	    	return 0;
	    }else if(s1.getHeight()>s2.getHeight()) {
	    	return 1;
	    }else {
	    	return -1;
	    }
	}
	}
	
	

class Pen{
  
public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


@Override
	public String toString() {
		return "Pen\n [brandname=" + brandname + ", price=" + price + ", length=" + length +"height= "+height+"]";
	}


public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


public String getBrandname() {
		return brandname;
	}


	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


private String brandname;
  private int price;
  private float length;
  private double height;
  
public Pen(String brandname, int price,float length,double height) {
	super();
	this.brandname = brandname;
	this.price = price;
	this.length=length;
	this.height=height;
}

//public int compareTo(Pen p) {
//	if(this.price==p.price) {
//		return 0;
//	}else if(this.price>p.price) {
//		return 1;
//	}else {
//		return -1;
//	}
////}
//public int compareTo(Pen p) {
//	return (this.brandname.compareTo(p.brandname));
//}
}
class Sort{
	public static void main(String args[]) {
		Pen p=new Pen("Cello",10,(float) 1.0,2.0323);
		Pen p1=new Pen("Parker",20,(float) 2.0,3.3432);
		Pen p2=new Pen("MontBlanc",30,(float) 3.0,4.2133);
		Pen p3=new Pen("Aurora",40,(float) 4.0,5.2321);
	
		
	 List<Pen> ls=new ArrayList<Pen>();
	   ls.add(p1);
	   ls.add(p);
	   ls.add(p3);
	   ls.add(p2);
	   Collections.sort(ls,new heightComparator());
	  // Collections.sort(ls,Collections.reverseOrder());
	  System.out.println(ls);
	}

	//List<String[]>lst=new ArrayList<String[]>();
	    
}
  

