package com;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class limitAndStatistics {
	public static void main(String args[]) {
		
		
		List<Integer> ls=Arrays.asList(1,22,3,465,67,32,12,34);
		//limit example
		System.out.println(ls.stream().limit(3).collect(Collectors.toList()));
		//sorting the stream
		ls.stream().sorted().forEach(System.out::print);
		
		//Statistics(report based on arithmatic methods)
		
		IntSummaryStatistics stats=ls.stream().mapToInt((x)->x).summaryStatistics();
		
		System.out.println("max Number"+stats.getMax());
		System.out.println("min Number"+stats.getMin());
		System.out.println("Average is"+stats.getAverage());
		System.out.println("Sum is"+stats.getSum());
	}

}
