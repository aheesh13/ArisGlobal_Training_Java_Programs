package com;

import java.io.*;



public class FileSteamTest {




public static void main(String arg[])
{

//java.io.File;

try
{
//byte[] b= {1,2,3,4,5,6,7};
String s="Hello Java";
byte[] b=s.getBytes();
OutputStream os=new FileOutputStream("C:\\Users\\00005813\\eclipse-workspace\\JavaHandsOn\\src\\com\\testout.txt");

for(byte read:b)
{
os.write(read);
}

os.close();


InputStream is=new FileInputStream("C:\\Users\\00005813\\eclipse-workspace\\JavaHandsOn\\src\\com\\testout.txt");
int size=is.available();
for(int i=0;i<size;i++)
{
System.out.print((char)is.read());
}
is.close();

}
catch(Exception e)
{
System.out.println("e "+e.getMessage());
}

}
}
