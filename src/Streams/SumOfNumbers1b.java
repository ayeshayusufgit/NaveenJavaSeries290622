package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class SumOfNumbers1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,4,5,6,22,3,90,89,2,1,3,4,55,6);
		double sum= list.stream().mapToDouble(e->e).sum();
		
		System.out.println("Sum of Numbers:"+sum);

	}

}
