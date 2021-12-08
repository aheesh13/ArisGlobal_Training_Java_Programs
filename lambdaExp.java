package com;
 
	@FunctionalInterface
	interface Hello{
		abstract String hello(String a);
	}
	interface add{
		abstract int add(int a1,int b1);
	}
    interface length{
    	abstract int StrLength(String c);
    }
    interface square{
    	abstract int numSquare(int d);
    }
    interface eonum{
    	abstract int evenOddNum(int e);
    }
public class lambdaExp {
 public static void main(String args[]) {
	 Hello h=(a)->{return "hello"+" "+a;};
	 System.out.println(h.hello("aheesh"));
	 
	 add val=(a1,b1)->{return a1*b1;};
	 int ans=val.add(10, 20);
	 System.out.println(ans);
	 
	 length ln=(c)->{return c.length();};
	 int res=ln.StrLength("Psychopath");
	 System.out.println(res);
	 
	 square sq=(d)->{return d*d;};
	 int res1=sq.numSquare(5);
	 System.out.println(res1);
	 
	 eonum eo=(e)->{if(e%2==0) {
		 return 1;
	 }else {
		 return 0;
	 }
	
	 };
	 int res2=eo.evenOddNum(3);
	 System.out.println(res2);
 }
}
