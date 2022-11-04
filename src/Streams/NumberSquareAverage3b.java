package Streams;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list=Arrays.asList(1,10,20,30,15);
		
		//1 100 400 900 225
		//average of numbers > 100
		
		double average=list.stream().mapToInt(e->e*e).filter(e->e>100).average().getAsDouble();
		
		System.out.println("Average:"+average);
		
		

	}

}
