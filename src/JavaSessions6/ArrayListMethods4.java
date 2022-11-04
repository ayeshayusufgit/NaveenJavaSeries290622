package JavaSessions6;

//The complete collections api will be from java.util package
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class ArrayListMethods4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList is not synchronized
		//Multiple threads can enter object at the same time
		//multiple threads can access the object to read values, delete values, 
		//add values 
		//Non synchronized collections are faster than synchronized(not thread safe)
		//multithreading environment arraylist is not preferred
		
		//Vector class :JDK 1.0 (legacy class)
		//Synchronized
		Vector<String> empNames=new Vector<String>();
		empNames.add("test");
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(2);
		ar.add(40);
		ar.add(45);
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		ar.addAll(marks);
		
		System.out.println(ar);
		
		//Can be used to convert the non synchronized ArrayList to synchronized AL
		//Even the newly added elements on adding into the list, the list will still be
		//synchronized
		List<Integer> ar1=Collections.synchronizedList(ar);
		
	}

}
