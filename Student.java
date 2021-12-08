package com;





class Student
{
@Override
public String toString() {
return "Student [id=" + getId() + ", name=" + getName() + ", age=" + getAge() + "]";
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
private int id;
private String name;
private int age;

}




 class ArrayDemo {

public static void main(String args[])
{
  
Student[] name=new Student[3];

for(int i=0;i<name.length;i++) {
	name[i]=new Student();
}

name[0].setId(1);
name[0].setName("Abc");
name[0].setAge(25);

name[1].setId(2);
name[1].setName("Rajan");
name[1].setAge(25);


name[2].setId(2);
name[2].setName("Priya");
name[2].setAge(25);

  
   for(Student s:name) {
	System.out.println(s.toString());
   }

}



}