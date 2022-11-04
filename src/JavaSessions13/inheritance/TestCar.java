package JavaSessions13.inheritance;

import java.util.concurrent.CancellationException;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b=new BMW();
		b.start();
		//the BMW start()(overriden) will be called
		//The preference will always be given to the child class
		b.stop();//inherited method
		b.refuel();//inherited method
		b.autoParking();//individual method of the BMW class
		b.engine();//inherited method from super super class(grand parent) Vehicle
		//These are the methods which can be accessed from the BMW class object ref 'b'
		//b.theftSafety(); this method from the Audi class cannot be accessed from 
		//                 the BMW class even though they are siblings
		
		//b.sportsMode(); this method from the Audi class cannot be accessed from the BMW class
		//      		  the BMW class even though they are siblings
		
		Audi a=new Audi();
		a.start();	//All the methods inherited from Car class can be accessed
		a.stop();	//All the methods inherited from Car class can be accessed
		a.sportsMode();	//All the methods coming from Audi class can be accessed
		a.theftSafety();	//All the methods coming from  Audi class can be accessed
		
		Car c=new Car();
		c.start();//The preference is given to the start() of the Car class
		c.stop();
		c.refuel();
		//c.autoParking();The methods from BMW class cannot be accessed from the Car class
		//c.theftSafety();  The methods from Audi class cannot be accessed from the Car class
		//c.sportsMode(); The methods from Audi class cannot be accessed from the Car class
		c.engine();//from the Super class Vehicle
		
		//Child class object can be referred by parent class reference
		//called top casting
		
		new BMW();//no reference object which is eligible by the garbage collector
		//This can be referred by parent class reference variable
		
		Car c1=new BMW();//BMW will have the inherited methods and the methods specific to BMW
		//since the object created is of type BMW, then the invoked method will be that of the start() of BMW()
		
		c1.start();//The overridden method of start() will be invoked
		c1.stop();//The stop() will be inherited from the Car to BMW class and will be invoked		
		c1.refuel();//The refuel() will be inherited from the Car to BMW class and will be invoked
		//c1.autoParking(); is not accessible with c1 reference as its a method specific to BMW
		//and can be accessed by the BMW class obj reference variable
		
		//child class being referred by grant parent class ref variable
		Vehicle v1=new BMW();//allowed in java
		v1.engine();
		//v1.start();			Cannot be accessed
		//v1.autoParking();		Cannot be accessed
		//v1.stop();		Cannot be accessed
		//v1.refuel();		Cannot be accessed
		
		
		
		//Car c1=new BMW();//Every Car is a BMW
		//c1.autoParking();
		//java does not allow that c1 accesses autoParking() of BMW. There is a 
		//security check called the reference type check done n which fails, due to which java 
		//doesn't allow individual methods of BMW to be accessed by c1.
		
		//c1.stop()
		//The reference type check will be passed since this method is inherited from the parent
	
		//down casting:
		//parent class object can be referred by child class reference variable?
		//BMW b1=new Car(); gives an error "Cannot convert from Car to BMW"
		//Every BMW is not a Car
		
		//Downcasting is not allowed in java at runtime
		BMW b1=(BMW)new Car(); //this is allowed in java, ur forcefully converting a Car into BMW during runtime
		b1.start(); //gives this error ClassCastException during runtime
		
		
		
		//Grand Parent class object can be referred by the child class ref variable
		BMW b2=(BMW)new Vehicle();//at runtime gives CCException
		
		Science s1=new BMW();//this is allowed but downcasting(reverse of topcasting) is not allowed
		//Every BMW is a Car but every Car is not BMW
		//Every BMW is a Vehicle but every Vehicle is not BMW
		//Every BMW is a Automobile but every Automobile is not BMW
		//Every BMW is a Physics but every Physics is not BMW
		//Every BMW is a Science but every Science is not BMW
	}

}
