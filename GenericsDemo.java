package com;

import java.util.ArrayList;
import java.util.List;

class Employee<TID,TNAME,TSALARY>
{
TID ID;
TNAME Name;
TSALARY salary;	

public Employee(TID iD, TNAME name, TSALARY salary) {
	super();
	ID = iD;
	Name = name;
	this.salary = salary;
}

void print()
{
System.out.println("ID "+ID);
System.out.println("Name "+Name);
System.out.println("salary "+salary);
}

}


class Test1
{
void get(String msg)
{
	System.out.println(msg);
	
}
	
}

//generics
class Test<T>
{

void get(T t1)
{

	System.out.println(t1);
	
}
	
	
}


public class GenericsDemo {
	
	public static void main(String arg[])
	{

		Employee<Integer,String,Integer> e1=new Employee(1, "Ravi", 50.00);
        e1.print();
	
	}

}
