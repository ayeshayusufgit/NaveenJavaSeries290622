package JavaSessions18;

import java.util.HashMap;
import java.util.Map;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Internally it uses a character array
		String s="This is my java code and I am so happy";
	
		
		//the length of the string including the space
		System.out.println(s.length());//38
		
		
		
		//charAt(index)- Give the character at a specific index
		System.out.println(s.charAt(0));//char at the 0th position is T
		
		System.out.println(s.charAt(37));//char at the 37th position is y
		
		//System.out.println(s.charAt(38));
		//char at the 38th gives StringIndexOutOfBoundException we cannot go beyond 37th index
		
		//System.out.println(s.charAt(-1));
		//char at the 1st gives StringIndexOutOfBoundException
		//We should never use between the limits of the lowest and highest index 0 n 37
		
		System.out.println(s.indexOf('j'));//11
		//the index of j will be printed and indexOf() is overridden
		
		System.out.println(s.indexOf('i'));//2
		//there are multiple i's in the string ie the first occurrence of i in the string
		
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		//second occurrence of i
		
		//Assignment: Find the 3rd occur of i and 4th occurrence of i
		
		System.out.println(s.indexOf("code"));//16
		//indexOf() can be used to get the indexOf() a string also
		
		System.out.println(s.indexOf("python"));//-1
		//if the string does not find a match then indexOf() returns -1
		
		String message1="Welcome Admin";
		
		if(message1.indexOf("Admin")>0) {
			System.out.println("Pass");
		}
		
		System.out.println(s.toLowerCase());//Convert the string to lowercase
		
		System.out.println(s.toUpperCase());//Convert the string to uppercase
		
		String str="	Hello World	";
		System.out.println(str.trim());
		//to remove spaces before H and after the spaces after d
		//trim only from the corners and not in between Hello World
		
		System.out.println(str.replace(" ", ""));//replacing the space with nothing
		
		String dob="01-01-1990";
		System.out.println(dob.replace('-','/' ));
		
		//contains()
		String s1="your user id is naveenautomation";
		System.out.println(s1.contains("naveenautomation"));
		if(s1.contains("naveenautomation")) {
			System.out.println("Pass");
		}
		
		//comparison() 
		String t1="hello java"; //called string literals are are preferred over String objects created using new
		String t2="hello java";
		//t2="hello python";
		System.out.println(t1.equals(t2));//true
		//equals() does the hard comparison matches the string content
		//equals() used in comparing strings and returns a boolean
		System.out.println(t1.equalsIgnoreCase(t2));//true
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1==t2);//here the references are being compared
		//true as both the references t1 n t2 are pointing to the same object
		
		String t5=new String("hello ruby"); //new keyword-creating objects inside the heap also
		//new String("abc") not a recommended practice 
		
		String t6="hello ruby";
		String t7=new String("hello ruby");
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
		
//		String[] credsArray=credentials.split(":");
//		String username=credsArray[0].trim();
//		String password=credsArray[1].trim();
//		Map<String,String> credsMap=new HashMap<String, String>();
//		credsMap.put(username, password);
		
		//substring:is used to fetch the substring from the main string
		//substring() is an overloaded method
		String message2="your order id is 12345";
		System.out.println(message2.substring(8)); //the string will be extracted from the 8th position till the end of the String
		System.out.println(message2.substring(17)); //the string will be extracted from the 17th position till the end of the String
		System.out.println(message2.substring(0,10));//string from 0th index to the 9th index, exclude the 10th index
		System.out.println(message2.substring(message2.indexOf("is")+3, message2.length()));
		//the position of "is" will be calculated at runtime and then 3 will be added to it
		System.out.println(message2.substring(message2.indexOf("is")+3));
		
		String orderId=message2.substring(message2.indexOf("is")+3, message2.length());
		//I want to store the $orderId in the orderId variable and can be used later
		
		System.out.println(orderId);//will be picked up from the SCP as no new keyword is used
		//program for the second occurrence of "is"
		
		String message3="your order id is 12345 is";
		System.out.println(message3.indexOf("is", message3.indexOf("is")+1));
	}
}
