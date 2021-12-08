package com;

 class BaseClass
{
 int rollno=100;
 
  void baseMethod()
{
System.out.println("Base Class Method");	
}
	
}



public class MethodOverriding extends BaseClass
{
	
	@Override
	void baseMethod()
	{
	System.out.println("child Class Method");	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseClass overriding=new MethodOverriding();
		overriding.rollno=200;
		overriding.baseMethod();

	}

}
