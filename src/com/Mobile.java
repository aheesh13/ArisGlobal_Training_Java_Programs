package com;

import java.util.Scanner;

public class Mobile {
 void display() {
	 System.out.println("Mobile Device");
 }
}
class Apple extends Mobile{
	void display() {
		System.out.println("Apple Brand");
	}
	public static int toInt(String s) {
		return Integer.parseInt(s);
	}
	public static double toDouble(String s) {
		return Double.parseDouble(s);
	}
	public static float toFloat(String s) {
		return Float.parseFloat(s);
	}
	
}
class OnePlus extends Mobile{
	void display() {
		System.out.println("One plus brand");
	}
	
	public static void main(String[] args) {
		Mobile mb=new Mobile();
		mb.display();
		OnePlus op=new OnePlus();
		op.display();
		Apple ap=new Apple();
		ap.display();
		int a=Apple.toInt("100");
		float b=Apple.toFloat("200");
		double c=Apple.toDouble("300");
		System.out.println(a+" "+b+" "+c);
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter The Elements of array");
			for(int i=0;i<=11;i++) {
				arr[i]=sc.nextInt();
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}