package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.sound.sampled.ReverbType;

public class SecondLowestHighestNumber10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList = Arrays.asList(0, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 3, 40);

		int secondLargest = numList.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Second largest="+secondLargest);
		int secondSmallest = numList.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("Second smallest="+secondSmallest);
	}

}
