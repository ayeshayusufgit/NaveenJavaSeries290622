package JavaSessions17.builderpattern;

public class TestUber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UberApp rider=new UberApp();
		rider.login()
				.search("sedan")
					.selectCar("sedan")
						.enterJourneryDetails("com street", "indiranagar")
							.startJourney()
								.completeJourney();
	}
}
