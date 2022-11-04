package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numberList=Arrays.asList(11,2,3,45,67,9,90,87,8,2);
		List<Integer> evenList=numberList.stream()
											.filter(e->e%2==0)//filtering the even numbers
												.collect(Collectors.toList()); //collecting the even numbers 
		
		System.out.println("Even list="+evenList);
		
		List<Integer> oddList=numberList.stream()
											.filter(e->e%2!=0)//filtering the even numbers
												.collect(Collectors.toList()); //collecting the even numbers 
		
		System.out.println("Odd list="+oddList);
	}

}
