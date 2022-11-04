package JavaSessions16;

//public static class Persons {
//static class is not allowed in java
//static can be only for variables and methods

class Persons{
	public void m1() {
		System.out.println("m1");
		m2();
		p2();//Can be accessed directly from the CMA or with the Classname Persons.p2()
	}
	
	public void m2() {
		System.out.println("m2");
		m3();
		Persons.p1();//Can be accessed directly from the CMA or with the Classname
	}
	public void m3() {
		System.out.println("m3");
	}
	public static void p1() {
		System.out.println("p1");
		p2();
		Persons pp=new Persons();
		//only can access static methods as they are in the CMA and non static 
		//using the object.method()
		pp.m3();
	}
	
	public static void p2() {
		System.out.println("p2");
		p3();
		Persons ppp=new Persons();
		// not a proper way of accessing m3()
		//as many objects are being created
		
		ppp.m3();
	}
	public static void p3() {
		System.out.println("p3");
	}
	
	//inside a static block only static methods can be accessed but if non static methods
	//need to be accessed can be done by creating the object of the class and then
	//accessing
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is called method chaining(calling the non static method from another method)
		Persons p1=new Persons();
		p1.m1(); 
		//for the m1() to be triggered p1.m1() has to done
		//or the sequence to be started
		p1.m2();
		
		//Method chaining is also applicable for static methods
		//calling a static method from another static method
		Persons.p1(); //or p1() as its static
		//p1() can call p2() and p2() can call p3() etc directly as they are in the CMA	
	}
}
