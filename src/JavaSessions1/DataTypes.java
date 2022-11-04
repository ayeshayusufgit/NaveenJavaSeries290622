package JavaSessions1;

//package is an in built java keyword
//keywords should always begin with a small letter

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//public, class, static, void  are the java keywords used now
		//the code has to be written within the class body
		
		//java is not 100% object oriented programming language 
		//ie its not required to create objects to work on the datatypes like incase of Primitive Datatypes
		
		
		//Data Types:
		//Strict Type
		
		//1.Primitive Datatypes: Dont need any objects to work with the primitive datatypes
			//1.Boolean type:boolean(true/false)
			//2.Numeric type:
				//1.Character type:char
				//2.Integral Type:
					//Integer:byte,short,int,long
					//Floating point: float, double
		
		//2.Non Primitive Datatypes: Need to create the object to work with the non primitive datatypes
		//String, Array, Class, Interface  
		
		
		//1.byte
		//size: 1 byte = 8 bits
		//range: -128 to 127
		
		byte b=10;
		//byte b=20;
		b=20;
		b=30;
		
		byte b1=40;	
		byte b2=0;
		byte b3=120;
		//byte b4=130; Error: Cannot convert from int to byte
		//byte b5=-130; Error: Cannot convert from int to byte
		byte b6 = -50;
	
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b+b1);
		
		//2.short
		//size: 1 short = 16 bits
		//range: -32768 to 32767
		short s1=1234;
		System.out.println(s1);
		
		//3.int:
		//size: 4 bytes = 32 bits
		//range: -2147483648 to 2147483647
		int i=23450;
		int i1=-190;
		int i2=1;
		//int i3=12.33; floating value cannot be stored in an int datatype 
		//whereas int can be stored in a floating datatype
		
		
		//4.long
		//size: 8 bytes = 64 bits
		//range: -9223372036854775808 to -9223372036854775807
		long population=1000002020;
		long g=989887654390L;
		// L is appended at the end of the number incase of an error in a long number
		// while printing the long number L does not get printed
		System.out.println(g);
		
		//5. float
		//size: 4 bytes = 32 bits
		//range:  after . (it can take upto 7 digits)
		float f1=12.33f;
		float f2=(float)34.55;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1+f2);
		
		float f3=100; //any non decimal value can be written inside float
		System.out.println(f3);
		
		//6. double 
		//size: 8 bytes
		//range:  after . (it can take upto 16 digits)
		double d=12.33; // d need not be prefixed when declaring a variable to type double
		double d1=34.5555;
		double d2=1.1;
		
		
		//7. char 
		//size: 2 bytes=16 bits
		//range: single digit value only with single quotes
		char c1='e'; //a-z or A-Z(65-90)
		char c2='1'; //0-9
		//char c3='11'; 2 or more digits gives an error
		char c4='*'; // all the special characters within single quotes
		//chinese n unicode characters(to support these characters 16 bits is used for char datatype)
		System.out.println(c1);
		
		//8. boolean: true/false
		//size: 1 bit(approx ~1 bit will be taken to store a boolean variable)
		boolean flag=true;
		boolean flag1=false;
		
	}
}
