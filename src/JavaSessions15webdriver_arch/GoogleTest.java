package JavaSessions15webdriver_arch;

public class GoogleTest {
	static WebDriver driver;
	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//SafariDriver driver=new SafariDriver();
		
		//Cross browser logic:
		String browser="chrome";	//can come from an excel sheet,xml file etc
		
		//on changing the browser from chrome to firefox to safari the corresponding browser will be launched
		//and the test will be running on the corresponding browser wo changing the code
		
		//with the top casting approach all the methods of the WD and the overridden methods of ChromeDriver can be accessed
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();//Overridden methods from the WD can be accessed
		}else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();//Overridden methods from the WD can be accessed
		}else if(browser.equals("safari")){
			driver=new SafariDriver();//Overridden methods from the WD can be accessed
		}else {
			System.out.println("plz pass the right browser");
		}
		
		driver.get("www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement();
		driver.findElements();
		driver.click();
		driver.sendKeys("naveen@gmail.com");
		driver.close();
		
		//Even in the actual ChromeDriver class there are no individual methods there coz 
		//top casting is used and only overridden methods can be called coming from WebDriver interface
		
	}

}
