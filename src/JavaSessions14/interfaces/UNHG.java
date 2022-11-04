package JavaSessions14.interfaces;

public class UNHG {

	
	public void medicalInfo() {
		System.out.println("UNHG--medicalInfo");
		
	}
	
	//Since this is a global covid guidline(used worldwide), 
	//this doesnt need to be overridden 
	public static final void covidGuidelines() {
		System.out.println("UNHG--covidGuidelines");
	}
}
