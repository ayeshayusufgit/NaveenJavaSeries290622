package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgOfNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list=Arrays.asList(-1,1,2,3,4,5,33,44,22,12,34,0);

		double average=list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("Average is:"+average);
	}

}
