package JavaSessions17;

public class StringManipulations_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="This is my java code and I am so happy";
		System.out.println(s.length());//38
		System.out.println(s.charAt(0));//T
		System.out.println(s.charAt(37));//y
		//System.out.println(s.charAt(38)); StringIndexOutOfBoundException
		//We can go beyond the 37th index
		
		//System.out.println(s.charAt(-1)); StringIndexOutOfBoundException
		//Index cannot be a -ve number
		
		System.out.println(s.indexOf('j'));//11
		System.out.println(s.indexOf('i'));//first occurrence of 'i'->2
		
		System.out.println(s.indexOf('i',3));//second occurrence of 'i'->5
		//3 cannot be a hardcoded number as adding hello to string s the index of the second occurance of 'i' changes
		
		System.out.println(s.indexOf('i',s.indexOf('i')+1));
		//second occurrence of 'i' using a non hardcoded method
		
		String s1="This is my java code and I am so happy java is the best";
		//find the 3rd,4th snd 5th occurrence of 'i', no hardcoded value
		
		System.out.println(s.indexOf("code"));//to get the index of a word
		System.out.println(s.indexOf("python"));//python is not available in the main string so -1 will be returned
		
		String mesg="Welcome Admin";
		if(mesg.indexOf("Admin")>-1) {
			System.out.println("Pass");
		}
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		String str="	Hello World		";
		System.out.println(str.trim());
		
		System.out.println(str.trim().replace(" ", ""));
		
		String dob="01-01-1990";
		System.out.println(dob.replace('-', '/'));
	}

}
