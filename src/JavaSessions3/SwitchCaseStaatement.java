package JavaSessions3;

public class SwitchCaseStaatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = "Opera"; // In Java the Switch/Case value is case sensitive
								  // ie if browser is "chrome" then it wont match 
		                          //any case and will execute the default as the case is "Chrome" 

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;

		case "firefox":
			System.out.println("Launch Firefox");
			break;

		case "safari":
			System.out.println("Launch Safari");
			break;

		case "ie":
			System.out.println("Launch IE");
			break;

		default:
			System.out.println("Pls pass the right browser");
			break; 
			//the usage of break in this case is optional
			//coz its wo it also it will break out as its the last case
			
		}
		
		
		
		int marks=100;
		switch(marks) {
		
		case 100: System.out.println("Grade A");
					break;
					
		case 90: System.out.println("Grade B");
					break;
					
		default:System.out.println("Fail");
					break;
		}
		
		
		int num=10;										//num<=10 ---- boolean expression
		switch(num) {  									//switch cannot have any boolean expressions
		case 10:  System.out.println("Fail");           //case cannot have any boolean expressions
					break;
		default : System.out.println("");
					break;
		}
		
		//Conditional Operators are used only with primitive data(==, <=, >=, <, >,!=)
		boolean flag=true;
		if(!flag) {
			System.out.println("BYE");
		}else {
			System.out.println("PASS");
		}
		
		
		char ch='A';
		switch(ch) {
		case 'A':System.out.println("A");
		         break;
		         
		case 'B':System.out.println("B");
				 break;
		}
	}
}
