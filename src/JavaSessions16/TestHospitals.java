package JavaSessions16;

public class TestHospitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FortisHospital fh=new FortisHospital();
		//All the methods can be accessed from the class(overriden or individual methods)
		fh.cardioServices();
		fh.dentalServices();
		fh.optServices();
		fh.medicalTraining();
		fh.emergencyServices();
		USMedicalAssc.billing();//is static so can be called by the interface.method()
		//FortisHospital.billing(); Cannot be accessed
		//fh.billing();Cannot be accessed as its a FortisHospital reference variable
		
		fh.medInsurance();//can access the default method
		
		fh.covidTest();
		UNHG.covidGuidelines();
		fh.medicalInfo();
		System.out.println(USMedicalAssc.min_fee);//constant value from the interface
		//USMedicalAssc.min_fee=200;
		//the values of this cannot be changed
		//they are final and static in nature
		
		System.out.println(FortisHospital.min_fee);
		//this will give an OP but a bad practice as interface variable should always be accessed 
		//by its interface.constant_name
		
		//USMedicalAssc us=new USMedicalAssc(); T
		//The object of the interface cannot be created
		
		//Topcasting 
		//Child class object can be referred by the parent class reference variable variable
		USMedicalAssc us=new FortisHospital();
		us.cardioServices();//methods coming from USMedicalAssc can be access by topcasting in this case
		us.oncologyServices();
		us.physioServices();
		us.emergencyServices();//this method can be accessed as its a common method of all the 3 interfaces
		//using the us reference the methods coming from UK and IndianMedicalAssc cannot be accessed
		//us.orthoServices();method from IndianMedicalAssc cannot be accessed
		//us.entServices();method from UKMedicalAssc cannot be accessed
		
		//us.medicalTraining();individual method from the class FortisHospital cannot be accessed
		//The child class property cannot be accessed from the parent interface reference variable
		//A private layer ie a reference type check layer will be created around the individual methods of the class
		//a security check happens in which java checks that "us" of reference type USMedicalAssc is trying to access
		//the methods of the UKMedicalAssc or IndianMedicalAssc or individual methods of Fortis class and this wont be allowed
		//the reference type check passed only when the reference "us" is from USMedicalAssc and trying toe access the methods from it
		
		//us.billing(); cannot be accessed
		
		us.medInsurance();// the default method can be accessed using "us" reference as its coming from USMedicalAssc
		us.covidTest();
		
		UKMedicalAssc uk=new FortisHospital();
		//only those methods coming from UKMedicalAssc can be accessed
		uk.emergencyServices();
		uk.entServices();
		uk.pediaServices();
		//uk.medInsurance(); cannot be accessed as its not from UKMedicalAssc
		
		//downcasting:CT not allowed
		//parent interface object can be referred by the child class reference variable
		//FortisHospital fortis=new USMedicalAssc();Cannot create object of the parent interface itself
		
		UKMedicalAssc ukAp=new ApolloHospital();
		ukAp.covidTest();
	}

}
