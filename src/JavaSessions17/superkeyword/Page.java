package JavaSessions17.superkeyword;

public class Page {
	int timeOut = 100;
	
	public Page() {
		System.out.println("Page default...");
	}
	
	public Page(int a) {
		System.out.println("Page default..."+a);
	}
	
	public Page(int a,int b) {
		System.out.println("Page default..."+(a+b));
	}

	public void display() {
		System.out.println("Page--Display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
