package com;

import java.util.HashMap;

public class Interview {
	public static void main(String arg[])
	{
	   String str="aabbccac";
                //a2,b2,c3
	
	   char[] charArray=str.toCharArray();
	  
	  HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<charArray.length;i++)	
		{
			 int count=0;
		     char charSearch=charArray[i];
		     
		     for(int j=i;j<charArray.length;j++)
		     {
		    	 if(charSearch==charArray[j])
		    	 {
		    		 count=count+1;
		    	 }
				//System.out.println(charArray[i]);
			 }
		     map.put(charSearch, count);
		}
     
	}	
}
