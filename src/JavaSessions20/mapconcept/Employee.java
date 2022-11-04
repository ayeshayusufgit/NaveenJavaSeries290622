package JavaSessions20.mapconcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> empMap=new HashMap<String, String>();
		empMap.put("A", "Tom");
		empMap.put("B", "Peter");
		empMap.put("C", "Robert");
		
		System.out.println(empMap.get("A"));

		HashMap<String, Integer> studMap=new HashMap<String, Integer>();
		studMap.put("Tom", 100);
		studMap.put("Peter", 200);
		studMap.put("Peter", 300);
		//duplicate keys can be maintained
		//the key Peter will be replacing the previous key(200 will get replaced by 300)
		studMap.put("Naveen", 300);
		//the value can be a duplicate like 300 in "Peter" n "Naveen" key
		studMap.put(null, 400);//the key can be null in a HashMap
		studMap.put(null, 500);//null key can be updated with another value
		System.out.println(studMap.get("Peter"));//300
		System.out.println(studMap.get(null));//500
		
		//To traverse through the hashmap and print the key n values using lamda
		studMap.forEach((k,v) -> System.out.println(k+":"+v));
		//forEach() method behaves like a forEach loop
		//k->key, v->value
		//The ordering of the keys are not in the same order of insertion
		
		//null will always be stored in the topmost segment(first position)
		//the hashcode of null will never be calculated
		
		//HashMap doesn't maintain any order or index
		//AL the order is maintained as it maintains an index an no concept of hashcode
		
		
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(1, 100);
		map.put(2, 200);
		
		HashMap<Integer, String> userMap=new HashMap<Integer, String>();
		userMap.put(101, "Tom");
	}

}
