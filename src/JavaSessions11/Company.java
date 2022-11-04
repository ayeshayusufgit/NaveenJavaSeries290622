package JavaSessions11;

public class Company {
	//program 3
	
	public String name;
	private int sharePrice;
	public String hq;
	
	//setter
	public void setSharePrice(int sharePrice) {
	//the class variable sharePrice is initialized to the local variable sharePrice
    //to access the class variable this keyword will  be used
	//this keyword is pointing to the current class object
		this.sharePrice=sharePrice;
	}
	
	//this method can be accessed from outside which is 
	//internally accessing the private variable sharePrice
	//An indirect access is provided to the sharePrice variable by the public method
	//getter
	public int getSharePrice() {
		return sharePrice;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c1=new Company();
		c1.name="IBM";
		c1.sharePrice=100;
		//the private variable can be accessed only from within the class.
		c1.hq="USA";

	}

}
