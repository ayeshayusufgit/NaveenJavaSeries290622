package JavaSessions6;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList - default class
		//Dynamic in nature
		//ArrayList maintains order/index
		//Sequential index based collection
		//It internally uses the concept of resizeable Array only
		
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100);// 0
		ar.add(200);// 1
		System.out.println(ar.size());
		ar.add(300);// 2
		ar.add(400);// 3
		System.out.println(ar.size());
		ar.add(500);// 4
		ar.add(600);// 5
		ar.add(700);// 6
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));//100
		System.out.println(ar.get(6));//700
		
//		System.out.println(800);
//		System.out.println(900);
//		System.out.println(1000);
//		System.out.println(1100);
//		System.out.println(1200);
//		System.out.println(1300);
//		System.out.println(1400);
//		System.out.println(1500);
		System.out.println(ar.size());//7
		System.out.println(ar.get(0));
		System.out.println(ar.get(6));
		//System.out.println(ar.get(7));//the last physical segment is 6 
	 	                              //so the get(7) will be from the virtual segment 
		                              //and get(7) can be used only on the physical segment
									  //and the value cannot be picked
									  //thus throwing an error IndexOutOfBound(IOBE)
		
		//System.out.println(ar.get(-1));//IndexOutOfBoundException,no concept for -ve index in java
		
		ar.remove(5);//removes the element from the 5th index
		System.out.println(ar.get(5));
		System.out.println(ar.size());//6
		System.out.println(ar);//prints the element from the arraylist
		
		ar.add(12.33);//values of different datatypes can be added in the AL
		ar.add("testing");//adding a string
		ar.add('n');//adding a character
		ar.add(true);//adding a boolean
		
		//To print all the values from an AL:using loop
		for(int i=0;i<ar.size();i++) {
			System.out.print(ar.get(i)+"->");
		}
		System.out.println();
		
		//To print all the values from an AL:using foreach loop
		for(Object obj:ar) {
			System.out.print(obj+"->");
		}
		System.out.println();
		
		//Is a apart of the Collection Api, which is used to get the data
		//by iterating through the Collections(Arraylist/HashSet/HashMap etc)
		//To print all the values from an AL:using iterator
		
		Iterator itr=ar.iterator();
		
		while(itr.hasNext())
				System.out.print(itr.next()+"->");
	}
}
