package JavaSessions6;

import java.util.ArrayList;

public class ArrayListGenerics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int AL
		//ArrayList<int> ar = new ArrayList<int>(); wont be allowed
		//A wrapper class called Integer is created to store 
		//all the int values in the form of object
		ArrayList<Integer> marks = new ArrayList<Integer>();
		//any written inside <> brackets is called generics
		
		//Integer is a class available in java
		//Integer is a class non primitve type(a wrapper class)
		marks.add(100);
		
		//marks.add(12.33); wont be allowed to add,only int allowed
		//marks.add("test"); wont be allowed to add,only int allowed
		marks.add(200);
		marks.add(300);
		marks.add(400);
		//AL holds non primitve datatype  of type Integer
		
		//for each using Integer
		for(Integer data:marks) {//Integer datatype should be used and not int
							  //Integer is the wrapper class of int
			System.out.print(data+"->");
		}
		System.out.println();
		
		//for each using int
		for(int data:marks) {//Integer datatype should be used and not int
			  //Integer is the wrapper class of int
			System.out.print(data+"->");
		}
		System.out.println();

		//JDK 8 has new concept(feature) called Streams using which an 
		//ArrayList can be iterated
		//A lamda notation is used ie "->"
		//The ArrayList segment is converted into a stream and the stream has many 
		//inbuilt action methods, in this case using foreach method
		//(no looping mechanism is used) is using with a lamda expression,
		//to iterate through the stream.ele is a variable used  wo a datatype
		//ele is supplied to System.out.println(ele)
		
		marks.stream().forEach(ele->System.out.println(ele));
		//marks.stream().collect(supplier, accumulator, combiner)
		marks.stream().count();
		//marks.stream().filter(predicate);
		marks.stream().findFirst();
		
		System.out.println("-------------------------------");
		
		ArrayList<String> empList=new ArrayList<String>();
		empList.add("Tom");
		empList.add("Peter");
		empList.add("Lisa");
		System.out.println(empList.size());
		
		for(String data:empList) {
			//String datatype should be used
			System.out.print(data+"->");
		}
		System.out.println();
		
		// double AL
		ArrayList<Double> ar1 = new ArrayList<Double>();
		ar1.add(12.33);
		//ar1.add(100); wont be added as int data wont be allowed
		ar1.add(100.00);
		
		//for each using Double
		for(Double data:ar1) {//Double datatype should be used and not double
							  //Double is the wrapper class of double
			System.out.print(data+"->");
		}
		System.out.println();
				
		//for each using double
		for(double data:ar1) {//Double datatype should be used and not double
						  //Double is the wrapper class of double
			System.out.print(data+"->");
		}
		System.out.println();
		
		// String AL
		//usecases: 
		//a)All the employee names
		//b)In uber all the car names
		//c)Amazon all the product names 
		ArrayList<String> prodList=new ArrayList<String>();
		prodList.add("Apple");
		prodList.add("Samsung");
		prodList.add("Nokia");
		//prodList.add(100);
		
		for(String e:prodList) {
			System.out.print(e+"->");
		}
		System.out.println();
		
		// Object AL: to store Employee name(String),Age(int),Salary(double) 
		// different type of data 
		ArrayList<Object> empList1=new ArrayList<Object>();
		empList1.add("Dhara");
		empList1.add(25);
		empList1.add('f');
		empList1.add(34.55);
		empList1.add(true);
		System.out.println(empList.size());
		
		for(Object emp:empList1) {
			System.out.println(emp);
		}
		
		
		

		
		
		
	}
	
}
