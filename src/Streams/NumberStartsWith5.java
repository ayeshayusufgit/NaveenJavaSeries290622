package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberStartsWith5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//2, 222, 234, 567, 890, 432, 236, 211, 22
		
		List<Integer> numList=Arrays.asList(2, -222, 234, 567, 890, 432, 236, 211, 22);
		
		Predicate<String> cond1 = num -> num.startsWith("2");
		
		Predicate<String> cond2 = num -> num.startsWith("-2");
		
		List<Integer> numListWith2=numList.stream().map(e->String.valueOf(e)) 	//this converts the numbers into a string
												   		.filter(cond1.or(cond2) )	//cannot use startsWith on primitives thus its converted into a string, checks for a number beginning with 2
												   			.map(Integer::valueOf)			// converts the string back to number
												   				.collect(Collectors.toList());		//collects it in a list
		System.out.println(numListWith2);
	}
}