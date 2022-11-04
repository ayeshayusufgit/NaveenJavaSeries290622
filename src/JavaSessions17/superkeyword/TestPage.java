package JavaSessions17.superkeyword;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp=new LoginPage();
		//LoginPage class constructor will be called along with the 
		//Page class default constructor due to super() 
		
		lp.getTimeOut();
		lp.loginInfo();
		lp.display();
	}
}
