package JavaSessions15webdriver_arch;


//WebDriver has no idea about ChromeDriver apart from the methods which need to be implemented
//The methods from the WebDriver interface has to be implemented By ChromeDriver
public class SafariDriver implements WebDriver{

	public SafariDriver() {
		System.out.println("launch the safari browser.....");
	}
	
	@Override
	public void findElement() {
		System.out.println("find element");
		
	}

	@Override
	public void findElements() {
		System.out.println("find elements");
		
	}

	@Override
	public void click() {
		System.out.println("click on element");
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("enter value:"+value);
		
	}

	@Override
	public void get(String url) {
		System.out.println("launch url"+url);
	}

	@Override
	public String getTitle() {
		return "some title";
	}

	@Override
	public void close() {
	System.out.println("close the browser");
		
	}

}
