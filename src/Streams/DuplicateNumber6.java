package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	List<Integer> numList=Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
//		
//		Set<Integer> dupset=numList.stream()
//								  	.filter(e->Collections.frequency(numList, e)>1)
//								  		.collect(Collectors.toSet());
//		System.out.println(dupset);
							
		HashSet<Integer> mainSet=new HashSet<Integer>();
		Set<Integer> set=numList.stream()
									.filter(e->!mainSet.add(e)) //to collect the duplicates
										.collect(Collectors.toSet());
		
		System.out.println(set);
		
	}

}
