package JavaSessions2;

public class IncrementNDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//++
		
		//--
		
		
		//1.post increment(first assign then increment)
		int a=1;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		
		int g=-99;
		int h=g++;
		System.out.println(g);//-98
		System.out.println(h);//-99
		
		//2.pre increment(first increment then assign)
		int c=1;
		int d=++c;
		System.out.println(c);//2
		System.out.println(d);//2
		
		int m=-97;
		int n=++m;
		System.out.println(m);//-96
		System.out.println(n);//-96
		
		//3.post decrement
		int p=2;
		int q=p--;
		System.out.println(p);//1
		System.out.println(q);//2
		

		//4.pre decrement
		int u=2;
		int y=--u;
		System.out.println(u);//1
		System.out.println(y);//1
		
		int t1=2;
		System.out.println(t1++);//prints the original value
		System.out.println(t1);
		
		int l=5;
		System.out.println(++l);

	}

}
