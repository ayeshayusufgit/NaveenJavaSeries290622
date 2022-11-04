package JavaSessions11;

public class Browser_2 {
	
	String name;
	
	double version;
	//91.0,91.2
	
	String vendor;
	//Chrome->Google,Internet Explorer->Microsoft,Firefox->Mozilla
	
	public void getInfo(Browser_2 br) {
		//br is the browser reference passed to the method
		System.out.println(br.name+" "+br.version+" "+br.vendor);
		//Default values of the respective datatypes will be printed when its not initialized
		//name=null version=0.0 vendor=null
		
		//After initalization
		//chrome 91.1 Google
	}
	
	public void sum(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser_2 br=new Browser_2();
		br.name="chrome";
		br.version=91.1;
		br.vendor="Google";
		
		br.getInfo(br);
		//Calling a method by passing the reference
		//Call by reference/Pass by reference
		//The driver object can be passed due to which multiple objects need not e created
		//Thus single object will be having multiple references
		
		br.sum(10, 20);//Call by value
	}

}
