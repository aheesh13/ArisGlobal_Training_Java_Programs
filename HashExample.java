package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hash code is used to calculate the buckets.
		Map<Integer,String> h = new HashMap<>();
		System.out.println(h.hashCode());
		h.put(1,"data");
		System.out.println(h.get(1).hashCode());
		//System.out.println(h.hashCode());
		h.put(2,"data");
		System.out.println(h.get(2).hashCode());
		//System.out.println(h.hashCode());
		System.out.println(h.hashCode());
		h.put(3,"data");
		System.out.println(h.get(3).hashCode());
		//System.out.println(h.hashCode());
		//h.put(4,"last");
		System.out.println(h.hashCode());
		Iterator<Map.Entry<Integer,String>> itr = h.entrySet().iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		//System.out.println(itr.hashCode());
		}
		System.out.println(h.get(1).hashCode()+h.get(2).hashCode());
		}
	}

