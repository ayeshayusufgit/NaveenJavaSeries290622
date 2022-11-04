package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortNumbers8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList=Arrays.asList(-1,0,1,3,10,20,30,15,1,13,1,2,2,10,30,19,3,30,40);
		
		List<Integer> sortedAscList=numList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedAscList);

		List<Integer> sortedDescList=numList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedDescList);
		
	}

}
