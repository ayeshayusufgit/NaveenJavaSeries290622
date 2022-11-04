package JavaSessions13.inheritance;

public class MethodOverloadingConcept {

	public void start() {

	}

	public void start(int a) {
		System.out.println(a);
	}

	public void start(String a, int b) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingConcept obj=new MethodOverloadingConcept();
		obj.start(10);//The compiler knows which methods needs to be called and its during compile time		

	}

}
