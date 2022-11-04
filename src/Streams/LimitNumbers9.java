package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList=Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3,30,40);
		
		List<Integer> limitList=numList.stream().limit(5).collect(Collectors.toList());
		System.out.println(limitList);
		
		int sum=numList.stream().limit(5).reduce((p,q)->p+q).get();
		System.out.println(sum);
		
		List<Integer> skipList=numList.stream().skip(5).collect(Collectors.toList());
		System.out.println(skipList);
		
		int skipSum=numList.stream().skip(5).reduce((p,q)->p+q).get();
		System.out.println(skipSum);
		
		
		
		
	}

}
