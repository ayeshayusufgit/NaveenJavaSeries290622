package JavaSessions9;

public class ObjectReferenceConcept {
	//Class Data members
	
	//Class vars
	String name;
	int age;
	
	//Class methods
	public void get() {
		System.out.println("Get Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//obj is the object reference
		ObjectReferenceConcept obj=new ObjectReferenceConcept();
		
		obj=null;//results in a null reference object
		
		//obj.name="Tom";//NPE, theres an error in this line and the control doesnt goto the next line itself
		//obj.age=25;//NPE
		
		//System.out.println(obj.name);
		
		//Object have been created wo references called no reference object
		new ObjectReferenceConcept().name="Peter";//1st object gets created
		//name,age and get() can be accessed but this object 

		new ObjectReferenceConcept().age=25;//2nd object gets created
		new ObjectReferenceConcept().get();//3rd object gets created
		
		
		ObjectReferenceConcept obj1=new ObjectReferenceConcept();
		System.gc();
		
		
		
	}

}
