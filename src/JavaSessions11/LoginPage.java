package JavaSessions11;

//Program 5
public class LoginPage {
	
	private String userName;
	private String passWord;
	
	//The return type of getter depends on the type of value used
	public String getUserName() {
		return userName;
	}
	
	//The return type of setter is void in nature
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public void login(String userName,String passWord) {
		System.out.println("login with:"+userName+" password:"+passWord);
	}

}
