package JavaSessions16;

public class A {

	//Interview question
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A-main");
		B.main(args);//calling B class main()
		
		//final keyword is used to provide constant value
		
		//once the value is fixed it cannot be changed 
		//and results in an error on trying to change it
		
		final int a=10;
		//a=20;
		
	}

}
