package JavaSessions20.dataconversion;

public class DataConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Wrapper classes->Integer,Double,Boolean, 
		//WCs are available for all the primitive data types
		//Integer wraps the value of an integer to an object
		//Double wraps the value of double to an object
		
		//WCs are used for data conversion
		//These classes are non primitive
		
		
		String x="100";
		System.out.println(x+20);//10020
		
		//String to Integer conversion
		//usecase of WC->incase of Selenium if x="100" is returned or getting anything from the webpage is a string only,
		//to perform some arithmetic operation, we need to use the wrapper class to convert it into
		//int and perform on it
		
		int i=Integer.parseInt(x);//parseInt() is a static method of Integer wrapper class
		System.out.println(i+20);//120
		
		String y="100A"; //No equivalent integer value
		//Not a pure numeric string, these kind of value cannot be used
		//int j=Integer.parseInt(y);//NumberFormatException
		//System.out.println(j);
		
		//Can use split,trim
		String newStr=y.replaceAll("[A-Za-z]", "");
		System.out.println(newStr);
		
		String p="12.33";
		System.out.println(p+20);//concatenation will happen 12.3320
		double d=Double.parseDouble(p);//To convert String to double
		System.out.println(d+20);
		
		//integer to String
		int total=100;
		String t=String.valueOf(total);//"100" To convert from int to String
		//The string representation of the integer value
		
		System.out.println(t+20);//If string then concatenation happens
		//using valueOf(n) every data type can be converted into a String
		//valueOf(n) is an overloaded method takes in any type of data
		
		double k=12.33;
		String k1=String.valueOf(k);
		System.out.println(k1+90);
		
		
		//Integer,Double,Short these are inbuilt classes available in java called Wrapper classes
		//Data conversion happens only with wrapper class
		
		
		String g="true";
		//if condition only takes boolean value so the string "g" need to be converted into boolean
		//this can be done as follows using Boolean.parseBoolean()
		//This is preferred
		
		if(Boolean.parseBoolean(g)) {
			System.out.println("Pass");
		}
		
		//THis also does the same thing as above
		if(g.equals("true")) {
			
		}
		
		//int to String:
		//double to String:
		
		
		

	}

}
