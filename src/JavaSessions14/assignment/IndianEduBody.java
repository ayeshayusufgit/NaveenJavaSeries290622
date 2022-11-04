package JavaSessions14.assignment;

public interface IndianEduBody extends GlobalEduBody{

	public void environmentalScienceEngCourse();
	public void medicalElectronicsEngCourse();
	public void industrialEngCourse();
	
	public void timetable();
	public void professor();
	public static void canteen() {
		System.out.println("IndianEduBody--canteen");
	}
	 
	default void payment() {
		System.out.println("IndianEduBody--payment");
	}
	

}
