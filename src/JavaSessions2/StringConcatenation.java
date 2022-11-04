package JavaSessions2;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World";
		String s1 = "100"; // will be treated as string 100 and not integer 100
		String ph = "9898989898";
		String cc = "1234 5678 1234 5678";

		String x = "Hello";
		String y = "Testing";
		System.out.println(x + y); // here + concatenates the 2 strings

		int a = 100;
		int b = 200;
		System.out.println(a + b); // here + adds the 2 numbers
		System.out.println(x + a); // concatenation
		System.out.println(x + a); // concatenation
		System.out.println(a + b + x + y);//300HelloTesting
		System.out.println(x + y + a + b);//HelloTesting100200
		System.out.println(x + y + (a + b)); //HelloTesting300
		System.out.println(x + y + a + b + a + b); // HelloTesting100200100200
		
		System.out.println("The value of a:"+a);
		System.out.println("The value of b:"+b);
		System.out.println("The sum is:"+(a+b));
		
		System.out.println(x+" "+y);//To add a space in between the Hello Testing
		
		double c=12.33;
		double d=23.44;
		System.out.println(x+y+c+d);
		
		char c1='a';//97
		char c2='b';//98
		System.out.println(c1+c2); //195
		//ASCII Range
		//A-Z 65 - 90
		//a-z 97 - 122
		//0-9 48 - 57
		
		System.out.println(c1+""+c2);
		
		//While coming up with a formula we should be considering for all the cases, 
		//thus we should coming up with a generic formula
		
		byte b1=60;
		byte b2=50;
		
		//byte b3=b1+b2; b3 is giving an error, as the sum can also be more than the byte range
		//such a datatype b3 should be taken for all the generic cases and int can be used
		
		int b3=b1+b2; // b3 can be of type long also
		              // even short b3=b1+b2 gives an error, the default datatype for any addition 
		              //is int onwards
		
		System.out.println(b3);
		
		System.out.println(b1+b2);//since we are not storing the value in a 
		                          //3rd variable the addition of 2 numbers can be done 
		
		int g1=10;
		int h1=2;
		System.out.println(g1/h1);//since g1 n h1 are ints so the decimal values will not come
		
		
		int g2=10;
		int h2=3;
		System.out.println(g2/h2);//since g2 n h2 are ints so the decimal values will not come
		
		System.out.println(10.0/3);//if any one of the operands are float the result will be floating
		System.out.println(10.0/2.0);
		System.out.println(10/2.0);
		System.out.println(10/3.0);
		
		//System.out.println(9/0); AE:/ by zero
		System.out.println(0/9);
		//System.out.println(0/0); AE:/ by zero
		System.out.println(0.0/0);  //Nan
		System.out.println(0/0.0);  //Nan
		System.out.println(0.0/0.0); //Nan
		
		System.out.println(5/0.0); //Infinity
		System.out.println(5.0/0.0); //Infinity
		
		
		char t='z';
		System.out.println(t);//the ascii value comes into picture when any arithmetic 
		                      //operations is performed like +,-,/,*
		
		System.out.println((int)t); //gives ascii number 
		
		
	}

}
