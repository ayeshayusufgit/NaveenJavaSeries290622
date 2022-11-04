package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList=Arrays.asList(-1,0,1,3,10,20,30,15,1,13,1,2,2,10,30,19,3,30,40);
		int max=numList.stream()
							.max(Comparator.comparing(Integer::valueOf))
								.get();
		
		System.out.println("Max="+max);
		
		int min=numList.stream()
							.min(Comparator.comparing(Integer::valueOf))//get the min value from the stream
								.get();//get the min number and store it in min

		System.out.println("Min="+min);
	}

}
