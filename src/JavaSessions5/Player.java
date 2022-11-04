package JavaSessions5;

public class Player {
	/*
	 * 
	 * Question 2: Write a program to create a static Array, having following
	 * cricket data: --name, age, team name, DOB, gender, Strike Rate --Try to
	 * create multiple Object Arrays for different players --Try to print all the
	 * values of each player on the console
	 * 
	 */

	String name;
	int age;
	String teamName;
	String DOB;
	char gender;
	double strikeRate;

	public void setData(String name, int age, String teamName, String DOB, char gender, double strikeRate) {
		this.name = name;
		this.age = age;
		this.teamName = teamName;
		this.DOB = DOB;
		this.gender = gender;
		this.strikeRate = strikeRate;
	}

	void display() {
		System.out.println(name + "|" + age + "|" + teamName + "|" + DOB + "|" + gender + "|" + strikeRate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] players;

		players = new Player[5];

		players[0] = new Player();
		players[0].setData("Virat Kohli", 30, "India", "12/12/1990", 'M', 99.9);
		players[1] = new Player();
		players[1].setData("Shami", 30, "India", "15/5/1990", 'M', 90.9);
		
		players[0].display();
		players[1].display();
	}

}
