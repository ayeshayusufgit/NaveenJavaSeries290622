package JavaSessions7;

public class ClassAndObjects {
	int i = 20;// class variable has global scope

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;// local variable is within the method only, can be used directly
		//The scope of the variable is within the function
		System.out.println(i);//O/P->10
		
		//Create the object of the class use new keyword
		ClassAndObjects obj=new ClassAndObjects();
		System.out.println(obj.i);//O/P->20
		
		//class - template/blueprint/category for the objects
		//(humans,animals,employee is a class)
		//will have class properties which will be used to create the objects
		//objects - physical entity should be created from the class category/template
		
		//class variables gives the attributes of the object
		//class methods gives the behaviour of the object
		
	}

}
