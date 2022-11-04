package JavaSessions8;

public class FunctionsInJava {

	//Cannot create a function within a function
	//Can call functions from another function
	
	//1. No input to a function and no return from the function
	//These type of functions are called void function(no return) 
	//as its created with a void keyword
	//return type:void
	public void test() {
		System.out.println("Test Method");
		int i=20;//local variable
		System.out.println(i);
	}
	
	public void getPrintPaper() {
		System.out.println("Print My Paper");
	}
	
	
	//2. No input to a function but some return
	//return type:int
	public int getBalance() {
		System.out.println("Get Balance");
		int fee=10;
		int tax=15;
		int total=fee+tax;
		return total;
	}
		
	public String getTrainerName() {
		System.out.println("Get Trainer Name");
		String name="Naveen";
		return name;
	}
	
	public boolean isEmpActive() {
		System.out.println("Is Emp Active");
		return true;
	}
	
	//3. Some input and some return
	public int add(int a,int b) {//a,b are called as method paramters 
	//a , b are called as input parameter comma separated and are local in nature
	System.out.println("Add method");
	int z=a+b;
	return z;
	}
	
	
	public int getCourseFee(String courseName) {
		System.out.println("Get Course Fee for: "+courseName);
		if(courseName.equalsIgnoreCase("Selenium")) {
			return 100;
		}else if(courseName.equalsIgnoreCase("API")) {
			return 50;
		}else if (courseName.equalsIgnoreCase("Mobile")) {
			return 70;
		}else {
			System.out.println("Course not found....");
			return -1; 
			//This is a standard practice that if the condition is not matched
			//-1 is returned.
		}
		//Its compulsory to return a value from this function
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inside a main() it never has any return type thus its of type void
		
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		obj.getPrintPaper();
		
		int p=obj.getBalance(); //1st method of calling, p variable is a holding parameter
		System.out.println(p+100);//additional calculation can be done on p
		//p can be used in multiple places
		
		System.out.println(obj.getBalance()); //2nd method of calling
		//1st method is preferred than the 2nd
		
		String n1=obj.getTrainerName();
		System.out.println("The trainer name is:"+n1);
		
		obj.getTrainerName(); 
		//not mandatory to store the return value in a variable
		//does not give an error but not a good practice
		
		if(obj.isEmpActive()) {
			//a boolean expression or value can be used
			//In this case the method is used directly wo a holding parameter
			System.out.println("Pass");
		}
		
		boolean status=obj.isEmpActive();
		System.out.println("Employee Status"+status);
		
		
		int sum1=obj.add(10, 20);//10 n 20 are called as method arguments
	   //obj.add(10, 20.22); 20.22 cannot be passed as double is not supported by the add method 
	   //The values passed to the add() should match the datatype
	   System.out.println("Sum of a n b="+sum1); 
	   //THe main use of functions are that the logic need not be written again an again
	   //Can be written once and called multiple times as an when required
	  
	   int sum2=obj.add(30, 40);
	   System.out.println(sum2-10);
	   //Further calculation can be done wo disturbing the main logic
	   
	   int fees1=obj.getCourseFee("Selenium");
	   System.out.println(fees1);
	   
	   int fees2=obj.getCourseFee("C#");
	   System.out.println(fees2);
	   
	   if(fees2==-1) {
		   System.out.println("This is not part of the training");
	   }
	}
}
