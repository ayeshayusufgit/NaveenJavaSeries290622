package JavaSessions19.timecomplexity;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;

		System.out.println(i);
		
		//How much time or iterations this code is taking?
		//Big O
		//O(1)-time taken to execute 
		//To execute this code once or 100 times will be constant(time will not increase or decrease)
		
		int j=15;
		int sum=i+j;//O(1)
		System.out.println(sum);
		//This program will be executed only once
		//Every statement that is written here(some are declaration,some are assignment of values,
		//some calculations will be executed only once and take O(1) ie constant time(not multiple times)
		
		//1 to 10
		for(int k=1;k<=10;k++) {
			System.out.println(k);
		}
		//1 time(k=1 will be executed only once)
		//n times(k<=n, this will be executed n times)
		//n times(k++, this will be executed n times)
		//n times(syso(k), this will be executed n times)
		//O(n)->1+n+n+n->1+3n
		
		//Suppose if k=1000000000 then k=1 time will be negligible and can be ignored
		//O(n)->3n+1~3n
		//O(3n)~O(n) The timecomplexity of a single for loop is O(n)
		//3n+1->is a linear equation
		
		//====================================================================
		for(int p=1;p<=10;p++) {
			for(int q=1;q<=10;q++) {
				System.out.println(p+" "+q+" ");
			}
			System.out.println();
		}
		
		//for the outer loop
		//1->p=1
		//n->p<=10
		//n->p++
		//n->syso.println()
		//=>1+n+n+n
		
		//for the inner loop
		//1->q=1
		//n->q<=10
		//n->q++
		//n->syso.print(p+""+q+" ")
		//=>1+n+n+n
		
		//Time complexity=>(1+n+n+n)(1+n+n+n)
		//=>(1+3n)(1+3n)=1+3n+3n+9n*n
		//=>1+6n+9n^2~9n^2+6n+1(quadratic equation)
		//removing the constant=>9n^2+6n
		//3n is common in the equation=>3n(3n+2)
		//removing the constant 2=>3n(3n)=>9n^2
		//removing the constant 9=>n^2
		//O(n2)
		
		System.out.println("==============================================");
		for(int p=1;p<=10;p++) {
			for(int q=1;q<=10;q++) {
				for(int r=1;r<=10;r++) {
					System.out.print(p+" "+q+" "+r);
				}
			}
			System.out.println();
		}
		
		
		//Time complexity for 3 loops
		//(1+n+n+n)(1+n+n+n)(1+n+n+n)
		//(1+3n)(1+3n)(1+3n)
		//=>(9n^2+6n+1)(1+3n)
		//=>9n^2+27n^3+6n+18n^2+1+3n
		//=>27n^3+27n^2+9n+1
		//removing the constant=>27n^3+27n^2+9n
		//removing the constant 3n=>3n(9n^2+9n+3)
		//removing the constant 2=>3n(9n^2+9n)
		//=>27n^3+27n^2
		//taking the common value=>27n^2(n+1)
		//removing the constant 1=>n^2(n+1)=>n^3
		//O(n^3)
		
		
		//https://www.geeksforgeeks.org/time-complexities-of-different-data-structures/
		//https://stackoverflow.com/questions/8185079/how-to-calculate-binary-search-complexity
		//https://www.hackerearth.com/practice/notes/sorting-and-searching-algorithms-time-complexities-cheat-sheet/
		
		
	}

}
