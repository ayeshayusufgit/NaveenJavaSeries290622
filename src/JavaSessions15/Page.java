package JavaSessions15;

//abstract class object cannot be created
//Abstract class can have constructors
//it will be called when we create the object of the child constructor
public abstract class Page {
	
	public Page() {
		System.out.println("Page -- default const...");
	}
	
	public Page(int t) {
		System.out.println("Page -- one param constructor..."+t);
	}

	public abstract void title();

	public abstract void url();

	public void header() {
		System.out.println("Page Header");
	}

	//the logo should not be changed or overriden in the child class thus making it final
	public final void logo() {
		System.out.println("Page Logo");
	}
}
