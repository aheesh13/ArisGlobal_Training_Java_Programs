package com;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileHandling {
public static void main(String args[]) {
	try {
		FileOutputStream f=new FileOutputStream("C:\\Users\\00005813\\eclipse-workspace\\JavaHandsOn\\src\\com\\module1.txt");
		ByteArrayOutputStream bo=new ByteArrayOutputStream();
		InputStream ia=new FileInputStream("C:\\Users\\00005813\\eclipse-workspace\\JavaHandsOn\\src\\com\\test1.txt");
           // int size=ia.available();
           // for(int i=0;i<size;i++) {
            	bo.write(ia.read());
           // }
            ia.close();
            bo.writeTo(f);
            bo.flush();
            bo.close();
}catch(Exception e) {
	e.printStackTrace();
}

}
}