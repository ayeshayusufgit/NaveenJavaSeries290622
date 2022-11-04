package JavaSessions16.exception_handling;

public class ThrowKeyword3 {

	// throw keyword is used to throw an exception deliberately
	// its a customized exception
	public static void main(String[] args) {

		// no reference variable required for throw
		// throw will throw the exception but only try/catch will handle the exception

		// a suggestion is given, either throw the exception from the main()
		// or handle it using try catch
		try {
			throw new Exception("Naveen Exception");
		} catch (Exception e) {
			System.out.println("Some exception is coming...");
			e.printStackTrace();
		}

		// This data is coming from excel sheet or api response data and reading a
		// string from there or any xyz resource

		String data = null;
		if (data == null) {
			try {
				throw new Exception("Data not found Exception");
				//For -ve scenarios u need to throw ur own exceptions(custom) as java doesnt 
				//provide these exceptions
			} catch (Exception e) {
				System.out.println("Data not found Exception is coming...");
				e.printStackTrace();
			}
		}
		
		//from the webpage, trying to find an element e1
		//if element e1 is not found
		//Selenium throws NoSuchElementException
		
		//if 1 property of e1 is missing, then selenium doesn't give any exceptions
		//in that case throw new Exception("ElementPropNotFoundException") 
		//a customized exception
		
		//
	}
}
