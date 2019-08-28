package com.study;

import java.util.List;
import java.util.function.Predicate;

public class Strategy {
	
//	public static int totalValue(List<Integer> values) {
//		int total=0;
//		for(int e:values) {
//			total+=e;
//		}
//		return total;
//	}
//	
//	
//	
//	public static int totalEvenValue(List<Integer> values) {
//		int total=0;
//		
//		for(int e:values) {
//			if(e % 2 == 0)total+=e;
//		}
//		
//		return total;
//	}
//	
//	public static int totalOddValue(List<Integer> values) {
//		int total=0;
//		
//		for(int e:values) {
//			if(e % 2 != 0)total+=e;
//		}
//		
//		return total;
//	}
	
	public static int totalValue(List<Integer> values,Predicate<Integer> selector) {
		int total=0;
		for(int e:values) {
			if(selector.test(e)) total+=e;
		}
		return total;
	}
	
	
	public static void main(String args[]) {
		List<Integer> numbers= List.of(1,2,3,4,5,6,7,8,9,10);
//		System.out.println(totalValue(numbers));
//		System.out.println(totalEvenValue(numbers));
//		System.out.println(totalOddValue(numbers));
		System.out.println(totalValue(numbers, e -> true));
		System.out.println(totalValue(numbers, e -> e % 2 == 0));
		System.out.println(totalValue(numbers, e -> e %2 != 0));
	}

}
