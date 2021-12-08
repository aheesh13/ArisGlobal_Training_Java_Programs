package com;
import java.io.FileWriter;
import java.io.FileReader;
public class DemoFileClass {
  public static void main(String args[]) {
	  String data="Hello World";
	  try {
		  FileWriter file=new FileWriter("file.txt");
		  file.write(data);
		  file.close();
	  }
	  catch(Exception e) {
		  e.getStackTrace();
	  }
	  char[] array=new char[100];
	  try {
		  FileReader file1=new FileReader("file.txt");
		  file1.read(array);
		  System.out.println(array);
		  file1.close();
	  }
	  catch(Exception e){
		  e.getStackTrace();
	  }
  }
	
	
}
