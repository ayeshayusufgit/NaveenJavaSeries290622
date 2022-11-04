package JavaSessions15webdriver_arch;

//In an interface the methods by default are abstract in nature, 
//thus abstract keyword need not be written with each abstract method in an Interface   
public interface WebDriver extends SearchContext{

	
	//The below methods can be overridden only with the @Override annotation only but
	//cannot have the method body as WD is an interface
	@Override
	public void findElement();
	
	@Override
	public void findElements();
	
	
	//only methods wo method body/abstract method
	public void click();
	public void sendKeys(String value);
	public void get(String url);
	public String getTitle();
	public void close();
}
