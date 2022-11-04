package JavaSessions15;

public class AmazonTest {
	
	
	public static void main(String args[]) {
		LoginPage lp=new LoginPage();
		lp.title();//overridden methods which are implemented in the LoginPage class 
		lp.url();//overridden methods which are implemented in the LoginPage class
		lp.header();//inherited method from the Page Class
		lp.logo();//inherited final method from the Page Class
		lp.doLogin("admin", "admin");//individual method of the LoginPage class
		
		HomePage hp=new HomePage();
		hp.title();//overridden methods which is implemented in the HomePage class
		hp.url();//overridden method which is implemented in the HomePage class
		hp.logo();//inherited method from the Page Class
		hp.header();//overridden method
		hp.logOut();//individual method of the HomePage class
		
		//Page p=new Page();	Cannot create an object of an Abstract class, gives an error
		
		//Top casting
		//Child class object can be referred by abstract parent reference 
		Page p=new LoginPage();
		p.title();
		p.url();
		p.header();
		p.logo();
		//p.doLogo(); the reference type check will fail here as the reference variable 
		//of type parent is trying to access an individual method from the child
		
		//Down casting:CT not allowed
		//LoginPage lPage=new Page();//Can't create an object of the abstract class Page
		
	
	
	}
	
	

}
