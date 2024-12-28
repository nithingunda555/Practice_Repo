public class MotoBikeRunner {

	public static void main(String[] args) {
		MotoBike ducati = new MotoBike();
		MotoBike honda = new MotoBike();
		ducati.start();
		honda.start();
		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());
		honda.setSpeed(80);
		System.out.println(honda.getSpeed());

	}

}
