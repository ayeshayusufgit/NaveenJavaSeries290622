package JavaSessions14.interfaces;

//multiple inheritance
public class FortisHospital extends UNHG implements USMedicalAssc ,UKMedicalAssc,IndianMedicalAssc{

	// class to class -- extends
	// interface to class -- implements
	// All the methods from USMedicalAssc should be overriden

	// USMedicalAssc says that to open a Fortis hospital in the US the below methods
	// need to be implemented, the implementation is left to the implementing classes
	// As per USMedicalAssc if the below services are not implemented then Fortis 
	// cannot be opened there
	
	//Coming from US
	@Override//its a good practice to have @Override annotation but not mandatory  
	public void physioServices() { 
		//These methods are called the overriden methods 
		System.out.println("FH--physioServices");
	}

	@Override
	public void cardioServices() {
		//These methods are called the overriden methods
		System.out.println("FH--cardioServices");
	}

	@Override
	public void oncologyServices() {
		//These methods are called the overriden methods
		System.out.println("FH--oncologyServices");
	}
	
	@Override
	//if @Override annotation gives an error then the method cannot be overridden
	public void medInsurance() {
		System.out.println("FH--payment");
	}
	
	//Coming from UK
	@Override
	public void entServices() {
		//These methods are called the overriden methods
		System.out.println("FH--entServices");
	}

	@Override
	public void pediaServices() {
		//These methods are called the overriden methods
		System.out.println("FH--pediaServices");
	}
	
	//Coming from India
	@Override
	public void orthoServices() {
		//These methods are called the overriden methods
		System.out.println("FH--orthoServices");
	}

	@Override
	public void dentalServices() {
		//These methods are called the overriden methods
		System.out.println("FH--dentalServices");
	}
	
	//Fortis hospital methods
	public void medicalTraining() {
		System.out.println("FH--medicalTraining for students");
	}
	
	public void optServices() {
		System.out.println("FH--optServices");
	}

	//This method is there apart of the Indian,UK and US Medical Associations guidelines
	//But this has to be overridden only once and not 3 times 
	@Override
	public void emergencyServices() {
		System.out.println("FH--emergencyServices");
	}

	//Coming from WHO which is implemented in the child class FortisHospital, 
	//as the covid test needs to be done in the hospitals itself not the orgs like
	//IndianMedicalAssc or USMedicalAssc or UKMedicalAssc 
	
	@Override
	public void covidTest() {
		//How exactly the covid test is to be done?Which medicines etc all need to added in by the hospital
		System.out.println("FH--covidTest");
	}
}