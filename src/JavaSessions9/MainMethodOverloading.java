package JavaSessions9;

public class MainMethodOverloading {

	//Interview Question
	//The jvm only checks for the main with the following:
	//should have public static void main(String[] args)
	//and the program execution starts from there
	
	//THe main() can be overloaded
	
	//If the public static void main(String[] args) {}
	//is removed then while running it eclipse will not allow it to be executed
	//on forcefully running the program 
	/*Error: Main method not found in class JavaSessions9.MainMethodOverloading, please define the main method as:
		   public static void main(String[] args)
		or a JavaFX application class must extend javafx.application.Application*/
		
	//The main method parameter String[] args can be renamed to ayesha aswell
	//(String[] ayesha), still the jvm will start execution from it
	//(it looks for the public static void main(String[] args) signature to begin execution
	// a check is made by the jvm wrt to the main syntax as above if fine then executed
	
	
	public static void main(String[] a) {
		// TODO Auto-generated method stub
		System.out.println("Main 1"+a);
		
		//An empty array of type String is being passed by the jvm, 
		//when the main is being called, thus gives an error
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
		System.out.println("Main 1"+a[0]);
		
		//String[] a of the main() is called cml parameters
		
		//Why only String[] a is being passed to the main?
		//as JVM can understand only that an not any other type of parameter
		
		//the cml arguments can be used only when an executable jar is created like testng.jar
		//and the argument is passed from the commandline during execution
		//and not for selenium
	}
	
	public static void main(int a) {
		System.out.println("Main 2"+a);
	}

	public static void main(int a,int b) {
		System.out.println("Main 3"+a+b);
	}
	
	public static void main(String a) {
		System.out.println("Main 4"+a);
	}
}
