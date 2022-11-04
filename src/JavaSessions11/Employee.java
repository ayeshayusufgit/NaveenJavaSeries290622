package JavaSessions11;

public class Employee {
//program 4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company c2=new Company();
		c2.name="Microsoft";
		
		
		//c2.sharePrice=100; which is a private member is not accessible from 
		//outside the Company class in the Employee class
		c2.setSharePrice(200);
		int sharePrice=c2.getSharePrice();
		System.out.println(sharePrice);
		
		//a public layer is provided to the user to access the private properties 
		//within the class using public setters/getters
		
		
		//the default value of int ie 0 will be printed if not initalized
		c2.hq="USA";
		
		//this public variable doesnt require a getting/setter as it can be accessed
		//from outside as its public
		System.out.println(c2.name);//public
		System.out.println(c2.hq);//public

	}

}
