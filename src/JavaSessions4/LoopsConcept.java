package JavaSessions4;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		
		
		
		//while loop
		int i=1; //->Start
		while(i<=100) { //->Conditional Statement
			System.out.println(i);
			//i++
			//++i;
			i=i+1;
		}
		
	    //infinite loop
		/*int k=1;
		while(true) {
			System.out.println(k);
			k++;
		}*/
		
		int m=10;
		while(m>=0) {
			System.out.println(m);
			m--;
		}

		int k=1;
		while(true) {
			System.out.println(k);
			k++;
			if(k>20) {
				break;
			}
		}
		
		
	
		
		
		
		//infinite loop:Example
		//while(true) {
			//System.out.println("Welcome to Vivanta by Taj!");
		//}
		
		//Facebook/Linkedn/Swiggy app ---- lazy loading
		//use cases: we have to use the while loop when we r not sure about number of cycles/iterations/
		
		//pagination:The occurance of a name in a page whose occurance can vary, 
		//sommetimes in the 2nd page n sometimes in the 4th page can be handled using while loop
		
		//carousel:how many times the carousel needs to be clicked to get all the products?can be handled
		//using while loop
		
		//calendar:in goibibo u need to select any future date(can be in march or april etc) then we wont 
		//know how many clicks will be required to get to the date, in that case while loop will be suitable
		
		//2.For loop
		//usecases: we have to use the while loop when we r sure about number of cycles/iterations/
		//menu items -->10--->20--->30
		//total number of links/images on the page
		//dropdown values
		//webtable
		
		//1 to 10 -- index based for loop
		for(int j=1;j<=10;j++) { // int j=1, statement will be executed only once
			System.out.println(j);
		}
		
		/*int p=1;
		for(;p<=10;p++) {
			System.out.println();
		}*/
		
		int p=1;
		for(;p<=10;) {
			System.out.println();
			//p++;
			//++p;
			p=p+1;
		}
		
		//for(int g=1;g<=10;g++) {
			//System.out.println(g);
		//}
		
		//for(;;) { Infinte loop  in for 
			//System.out.println("Welcome to Taj Hotel");
		//}
		//even number 2,4,6,8,10
		for(int even=2;even<=2;even+=2) {
			System.out.println(even);
		}
		//off numbers 1,3,5,7,9,....10
		for(int odd=1;odd<=2;odd+=2) {
					System.out.println(odd);
		}
		
		//double number used in the loop(int ,short,long,double n float can be used aswell)
		for(double d=1.0;d<=10.0;d++) {
		System.out.println(d);
		}
		//A-Z
		for(char c='A';c<='Z';c++) {//Interview question
			// internally a check is made wrt to the ascii 
			//values of 'A' and 'Z' and the condition will be executed
			System.out.println(c);//prints the actual value
			}
		
		for(int as=97;as<=122;as++) {//Interview question
			System.out.println((char)as);//the int value is converted to the character
			}
		
		System.out.println(10%2);
		System.out.println(10%3);
		
		for(int t=1;t<=100;t++) {
			System.out.println(t);
			if(t%5==0) {
				System.out.println("hi");
			}
		}
		
		for(int t=2;t<=100;t++) {//even num with %
			
			if(t%2==0) {
				System.out.println(t);
			}
		}
		
        for(int t=1;t<=100;t++) {//odd num with %
			
			if(t%2!=0) {
				System.out.println(t);
			}
		}
        
        
        //do - while
        //custom wait
        //element is displayed
        int r=1;
        do {
        	
        	r++;
        	System.out.println(r); //1
        	break;
        	
        }while(r<=10);
        
        //for each
        //recursion
        //streams
		
	}
}
