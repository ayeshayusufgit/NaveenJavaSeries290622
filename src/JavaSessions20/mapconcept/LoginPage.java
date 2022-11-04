package JavaSessions20.mapconcept;

import java.util.HashMap;

public class LoginPage {

	//This example can be provided in interview(RBAC using hashmap)
	
	
	//Role Based Acccess control features
	//Permission Based Access control
	//There are many users:admin users,partner user, customer, super admin,
	//admin can see everything
	//a customer will see different things
	//a category manager will see different things
	//a seller when he logs into amazon hell see different things
	//different users with different roles
	//in such a scenario HashMap can be used
	
	
	//All the credential can be maintained in a hashmap
	//by passing the key, the resp values(credentials) will be returned
	public static String getUserCred(String role) {
		HashMap<String, String> credMap=new HashMap<String, String>();
		credMap.put("admin", "admin@amazon.com;admin123");
		
		credMap.put("customer", "customer@gmail.com;cust123");
		
		credMap.put("seller", "seller@amazon.com:seller123");
		//to find out how many orders the seller got on amazon 
		
		credMap.put("partner", "partner@amazon.com;partner123");
		//myntra wants to list their products on amazon
		
		credMap.put("distributor", "dist@amazon.com:dist123");
		
		credMap.put("categorymanager", "cat@amazon.com;cat123");
		// the category manager is also working in amazon,creating 
		//the products and uploading in the categories of the app
		
		return credMap.get(role);
	}
	
	//does the login with the username and password
	//this method is not concerned about how it gets the username and password
	public static void doLogin(String un,String pwd) {
		System.out.println("Login with un:"+un+" and  pwd:"+pwd);
	}
	
	
	public static void main(String args[]) {
		
		//To login with category manager just change the 'admin'
		//no change in the script just change the role in the getUserCred(role)
		
		String cred[]=getUserCred("admin").split(";");
		String un=cred[0].trim();
		String pwd=cred[1].trim();
		
		doLogin(un, pwd);
	}	
}
