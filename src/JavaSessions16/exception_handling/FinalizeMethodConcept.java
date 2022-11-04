package JavaSessions16.exception_handling;

import JavaSessions12.Employee;

public class FinalizeMethodConcept {

	String name="Java";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int i=10;
		
//		finally should be used with try
//		finally {
//			
//		}	
		
		FinalizeMethodConcept obj=new FinalizeMethodConcept();
		System.out.println(obj.name);
		obj=null;	
		System.gc();
		
		//Garbage Collector will come inside the heap memory and try to destroy the object in the heap with no reference
		//GC will check if there is any finalize() method before destroying the object, in this case yes
		//GC will call finalize() before doing any cleanup activity(destroying the object)
		//finalize() is never called explicitly but called automatically when object is going to be destroyed
		
		//when any cleanup activity needs to be done before destroying an object with no ref then finalize() is called
		
		
		Employee e=new Employee();
		e=null;
		System.out.println("Calling Garbage Collector!");
		System.gc();
		
		//Will the garbage collector be called?
		//finalize method is not being called on calling the garbage collector in this case
		//the gc will check to see if in the Employee class if there is a finalize(), if yes will be called before the object is destroyed
		//ow it wont be called
		//Incase of Employee class object since there is no finalize() getting overriden so it wont be called before the object is destroyed
		//If the object of the FinalizeMethodConcept will be made null then finalize() will be called before its destroyed
	
		
		
	}
	
	//This finalize method is applicable for only this class
	@Override
	public void finalize() {
		System.out.println("Inside finalize method...");
	}
}
