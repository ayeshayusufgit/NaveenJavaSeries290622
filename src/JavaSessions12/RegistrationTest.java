package JavaSessions12;

public class RegistrationTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegistrationPage rPage=new RegistrationPage("Ayesha", "Yusuf", "ayesha.yusuf@gmail.com", "Kolkata05");
		rPage.setEmail("ayesha.yusuf123@gmail.com");
		
		System.out.println("Updated value of the new registration user:");
		System.out.println(rPage.getEmail());
	}

}
