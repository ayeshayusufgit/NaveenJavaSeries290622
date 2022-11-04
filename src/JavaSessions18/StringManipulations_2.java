package JavaSessions18;

public class StringManipulations_2 {

	public static void main(String[] args) {
		
		//contains()
		String s1="your user id is naveenautomation";
		System.out.println(s1.contains("naveenautomation"));
		if(s1.contains("naveenautomation")) {
			System.out.println("Pass");
		}
		
		//comparison() 
		String t1="hello java"; //called string literals are are preferred over String objects created using new
		String t2="hello java";
		String t3="hello Java";
		String t4="hello  Java";
		//t2="hello python";
		System.out.println(t1.equals(t2));//true
		
		//System.out.println(t1.equals(t2));//comparing "hello java" and "hello python" gives false
		
		//equals() does the hard comparison matches the string content
		//equals() used in comparing strings and returns a boolean
		
		System.out.println(t1.equalsIgnoreCase(t3));//true
		
		System.out.println(t1.equalsIgnoreCase(t4));
		//false do to the addition of a space
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1==t2);//here the references are being compared
		//true as both the references t1 n t2 are pointing to the same object
		
		String t5=new String("hello ruby"); //new keyword-creating objects inside the heap also
		//new String("abc") not a recommended practice 
		
		String t6="hello ruby";
		String t7=new String("hello ruby	");
		System.out.println(t5==t7);//false even though the strings contents are the same t5 n t7 are pointing to 2 different objects 
		System.out.println(t5==t6);//false comparisons are done based on object references and not exact values
		
		//String t3="hello java";
		//String t4="hello Java";
		//System.out.println(t3.equals(t4));//false
		//System.out.println(t3.equalsIgnoreCase(t4));//true
		//equalsIgnoreCase() does the comparison of Strings w/o the cases and returns a boolean
		
		//on appending a space to the String and comparing by ignoring the space it will be false 
		//as space is also including with the string in the comparison
		
		//split:
		String langStr ="JAVA_PYTHON_RUBY_PHP";
		String langArr[]=langStr.split("_");
		//The splitting is done based on _ and all the values will be stored in an array of type string 
		//Since the array is an index based collection the values can be fetched using the index or foreach loop
		
		System.out.println(langArr[0]);
		//System.out.println(langArr[4]);ArrayIndexOutOfBoundException
		for(String lang:langArr) {
			System.out.println(lang);
		}
		
		//Interview question
		String name="xXtestingxXjavaxXXSeleniumXxXPython";
		String nameArray[]=name.split("xX");
		System.out.println(nameArray.length);//5
		//System.out.println(nameArray[0].length());
		//to check if its a space(1 char) or blank value(0 char)=>it is a blank value
		System.out.println(nameArray[0]);//value will be blank
		System.out.println(nameArray[1]);//value will be testing
		System.out.println(nameArray[2]);//value will be java
		System.out.println(nameArray[3]);//value will be XSeleniumX
		System.out.println(nameArray[4]);//value will be Python
		
		String empData="Hiren;Patel;40;USA;01-01-1970;Selenium;QA";
		//The above data can be maintained in the excel sheet and can be fetched,split and the form can be filled
		String[] empArray=empData.split(";");
		
		for(String emp:empArray) {
			System.out.println(emp);
		}
		
		
		String credentials="admin;admin";
		System.out.println(credentials.split(";")[0]);
		//directly splitting the array and accessing its 0th index 
		System.out.println(credentials.split(";")[1]);
		
		//the above 2 lines split is used 2 times(not a good practice), 
		//split an store in array then use it
		
		//substring:is used to fetch the substring from the main string
		//substring() is an overloaded method
		String message2="your order id is 12345";
		System.out.println(message2.substring(8)); //the string will be extracted from the 8th position till the end of the String
		System.out.println(message2.substring(17)); //the string will be extracted from the 17th position till the end of the String
		System.out.println(message2.substring(0,10));//string from 0th index to the 9th index, exclude the 10th index
		System.out.println(message2.substring(message2.indexOf("is")+3, message2.length()));
		//the position of "is" will be calculated at runtime and then 3 will be added to it
		
		String orderId=message2.substring(message2.indexOf("is")+3, message2.length());
		//I want to store the $orderId in the orderId variable and can be used later
		
		System.out.println(orderId);//will be picked up from the SCP as no new keyword is used
		//program for the second occurrence of "is"
		
	}

}
