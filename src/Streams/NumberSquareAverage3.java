package Streams;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list=Arrays.asList(1,10,20,30,15);
		
		//1 100 400 900 225
		//average of numbers > 100
		
		double average=list.stream()
								.map(e->e*e)	//get each an every element from the arraylist and do the square
									.filter(e->e>=100)	//apply the filter condition, filter only take a boolean condition,if > 100 only then include
									//.filter(e->e>=900)	//apply another filter
											.mapToInt(e->e)		//the values are converted to integer
												.average()			//the average of all the filtered values
													.getAsDouble();		//get the average value in double
		
		
		System.out.println("Average:"+average);
	}
}
