package JavaSessions5;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		i=20;
		i=30;
		System.out.println(i);
//Multiple values cannot be stored in a single declaration variable
//Arrays are non primitive type of datatype
		
		
		//2 major limitation
		//1.array size is fixed(static array) to overcome this dynamic array is used ArrayList
		//2.data of the same type will be stored, to overcome this ArrayList is used
		//(AL storing data of type Object can be used)
	
		//usecases:
		//array used then there is constant/static data
		//In an application the menu items will not change very frequently in that case arrays are used.
		//(data is not that dynamic)
		//usage of months(months will always be 12)/days(days will be 31 at the max)
		//The data above is constant n does not change so arrays are suitable
		
		//AL
		//Incase of Uber customers vary on a daily basis
		//Subscribers on a daily basis on youtube
		
		//1. int array
		int j[]=new int[4];
		j[0]=10;
		j[1]=20;
		j[2]=30;
		j[3]=40;
		System.out.println(j[0]);
		System.out.println(j[3]);
		//System.out.println(j[4]); Array Index Of Bound Exception
		//System.out.println(j[-1]); Array Index Of Bound Exception
		System.out.println(j);//address of array j in the memory
		System.out.println(j[0]+j[2]);
		int len=j.length;
		System.out.println("Length="+len);
		System.out.println("Hi="+(len-1));
		System.out.println("Li="+0);
		
		//Print all the values from the array
		for(int k=0;k<=len-1;k++) {
			{
				System.out.println(j[k]);//10,20,30,40
			}
		}
		for(int k=0;k<len;k++) {
			{
				System.out.println(j[k]);//10,20,30,40
			}
		}
		
		for(int k=0;k<len;k++) {
			{
				System.out.println(j[k]);//10,20,30,40
			}
		}
	    //for each loop - enhanced for loop:
		for(int e:j) {// no indexing concept needs to be maintained, 
			          //the enhanced for loop will be calling the normal loop internally
					  //if the condition in a normal loop is used improperly, 
					  //may result in an ArrayOutBoundException, 
			          //which can never happen in the enhanced loop
		System.out.println(e);
		}
		
		//double array
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=100;
		d[2]=34.44;
		//d[3]=21.33;
		//System.out.println(d[3]);
		
		//char array:
		char c[]=new char[3];
		c[0]='a';
		c[1]='$';
		c[2]='1';
		
		for(char e:c) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------");
		String lang[]=new String[4];
		lang[0]="Java";
		lang[1]="Python";
		lang[2]="Js";
		lang[3]="Ruby";
		System.out.println(lang[0]+lang[1]);
		
		for(int p=0;p<lang.length;p++) {
			System.out.println(lang[p]);
		}
		
		for(String e:lang) {
			System.out.println(lang);
		}
		
		//Object Array
		Object emp[]=new Object[4];
		emp[0]="Tom";
		emp[1]=25;
		emp[2]='m';
		emp[3]=23.44;
		
		
		for(Object e:emp) {
			System.out.println(e);
		}
		
		
		String[] product=new String[100]; //Mathematical Calculation wrt to the memory used/wasted wrt to arrays 
										  //Need to be done as in the notes(and a very imp interview question)
		product[0]="Macbook Pro";
		product[1]="Macbook Air";
	}
}
