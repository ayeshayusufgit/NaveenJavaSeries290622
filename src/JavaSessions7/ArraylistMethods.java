package JavaSessions7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Other ways of declaring the ArrayList
		//No need to explicitly add numbers in the ArrayList using add
		ArrayList<Integer> numList=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		//Prints all the numbers in [] brackets
		System.out.println(numList);//Print the content of the ArrayList
		
		int numArray[]= {10,20,30,40,50}; // Array literals using comma separated, no new is used in this
		//Directly defining and initializing values
		
		System.out.println(numArray);//Prints memory location
		System.out.println(Arrays.toString(numArray));//Prints content of the array
		
		
		ArrayList<String> langList=new ArrayList<String>(Arrays.asList("C++","Java","Python","PHP"));
		//Prints all the numbers in [] brackets
		System.out.println(langList);
		
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> list2=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> list3=new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		
		System.out.println(list3);
		Collections.sort(list3);
		System.out.println(list3);
		
		System.out.println(list1.equals(list2));//equal checks for the exact content of the AL
		System.out.println(list1.equals(list3));
		
		if(list1.equals(list2)) {
			System.out.println("PASS");
		}
		
		//There is a webpage with a dropdown, having 5 elements and create an actual list 
		//and an expected list can be compared wrt to the ordering n content
		
		ArrayList<String> list4=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> list5=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		//list4.removeAll(list5);//A-B = list4 - list5
		//System.out.println(list4);
		
		list5.removeAll(list4);//B-A = list5 - list4
		System.out.println(list5);
		
		ArrayList<String> lang1=new ArrayList<String>(Arrays.asList("Java","Python","JS","DS","Algo"));
		ArrayList<String> lang2=new ArrayList<String>(Arrays.asList("Java","Python","JS","DS","PHP"));
	
		//First the AL needs to be sorted n then compared ow itll always give false
		//retainAll will retain the common elements
		lang1.retainAll(lang2);//A^B= lang1 ^ lang2
		System.out.println(lang1);
		
		ArrayList<String> list6=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> list7=new ArrayList<String>(Arrays.asList("p","q","r"));
		
		list6.addAll(list7);//Appends list6 to list7
		System.out.println(list6);
		System.out.println(list7);
		
		//list7.clear();//Clears the list
		//System.out.println(list7);
		
		ArrayList<String> cloneList=(ArrayList<String>)list7.clone();//Creates a copy of the AL(of any datatype) and returns the Object
		//and not the AL so needs to be converted into an AL by typecasting
		//This is a good practice to create a clone typecasting it to ArrayList<String> instead of ArrayList<Object> 
		//The warning can be ignored
		System.out.println(cloneList);//a duplicate copy of list7 is created called cloneList
		
		ArrayList<String> list8=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		list8.add(0,"T");//Add an element in index 0
		list8.add(5, "N");//Add an element at the end of the list
		//list8.add(10, "N"); A blank space cannot be created between the list and the element to be inserted
		//Gives an IndexOutOfBoundException
		System.out.println(list8);
	}

}
