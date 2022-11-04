package JavaSessions9;

import java.util.ArrayList;

public class Customer {
	//Sample for real time code of ecom application
	
	//This is their be core logic for search
	
	//The user uses the ui application which internally uses the search be 
	//logic (on the pwa,android or ios app) in the form of apis
	
	//the customer performs the search using the client(ios or android or pwa) 
	//which calls the webservice which inturn calls the search api->
	//the search api gets the result and sends it back to the app->
	//the client displays the result in its ui
	
	//If the ui is access via api, the function returns the productList
	//the BE developer writes the api which is consumed by the FE code 
	//writted by the FE developer to display the result on the UI to the customer
	
	//The apis are deployed on the be server called as the webservice->
	//consumed by the android app written by the android dev or ios app 
	//writted by the ios dev or pwa writted by the web developer 
	
	public void doLogin(String username, String password) {

	}

	//The doSearch function is behaving like an api
	//the doSearch() code is written by the BE dev
	//The product added in the db(oracle/mongodb/) thus the data is available
	//done by the dba
	public ArrayList<String> doSearch(String brandName) {
		System.out.println("Searching for Products of Brand:" + brandName);
		ArrayList<String> prodList = new ArrayList<String>();
		switch (brandName) {
		case "Apple":
			prodList.add("iphone12");
			prodList.add("macbook pro");
			prodList.add("ipad mini");
			break;
		case "Samsung":
			prodList.add("s8");
			prodList.add("Samsung Tablet");
			break;
		case "HP":
			prodList.add("HP Laptop");
			prodList.add("HP Headset");
			prodList.add("HP Tablet");
			break;
		default:
			System.out.println("Product Brand not found...." + brandName);
			break;
		}

		return prodList;
	}

	//WAF - launch the browser
	//input param:browserName(String)
	//return:void
	public void launchBrowser(String browserName) {
		System.out.println("The browser name is..."+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			System.out.println("Launch Chrome");
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.out.println("Launch Firefox");
		}else if(browserName.equalsIgnoreCase("safari")) {
			System.out.println("Launch Safari");
		}else {
			System.out.println("Please pass the right browser!"+browserName);
		}
	}
	
	//Never pass a parameter which is not used in the function example version
	//This is not a good practice
	//THe maximum number of arguments that can be passed to a function is 255
	public void launchBrowser_switchcase(String browserName,String version) {
		System.out.println("The browser name is..."+browserName);
		
		switch(browserName) {
		case "chrome":System.out.println("Launching chrome");
		             break;
		             
		case "firefox":System.out.println("Launching firefox");
                      break;
        
		case "safari":System.out.println("Launching Safari");
        			  break;
        			  
        default :System.out.println("Please pass the right browser!"+browserName);
        		 break;             
		}
	}

	//WAF : register a user
	//params:fn,ln,email,ph,password,age,dob,city,address,country
	//Java standard says to not pass parameters more than 5
	//An object can be passed to a function instead of multiple arguments
	
	public void register(String fname,String lname,String phone,String password,int age) {
		
	}
	
	
	
	public void addItem() {

	}

	public void placeOrder() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1 = new Customer();
		ArrayList<String> appleProdList = cust1.doSearch("Apple");
		System.out.println(appleProdList.size());
		System.out.println(appleProdList);

		ArrayList<String> samsungProdList = cust1.doSearch("Samsung");
		System.out.println(samsungProdList.size());
		System.out.println(samsungProdList);
		
		
		for(String samsungProd:samsungProdList) {
			System.out.println(samsungProd);
			
		}
		
		ArrayList<String> nokiaProdList = cust1.doSearch("Nokia");
		System.out.println(nokiaProdList.size());
		System.out.println(nokiaProdList);
		
		cust1.launchBrowser_switchcase("chrome","90");
	}
}
