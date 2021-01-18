
/**
 * Does some cool math with blood and stuff
 * 
 * @author Ronny
 *
 */
public class BloodSpeedCalculator {

	DopplerMethod[] dopplerMethods;

	/**
	 * Default constructor
	 */
	BloodSpeedCalculator() {
		this.dopplerMethods = new DopplerMethod[5];

		this.dopplerMethods[0] = new DopplerMethod(1000000);
		this.dopplerMethods[1] = new DopplerMethod(4000000);
		this.dopplerMethods[2] = new DopplerMethod(8000000);
		this.dopplerMethods[3] = new DopplerMethod(1000000, 500);
		this.dopplerMethods[4] = new DopplerMethod(4000000, 500);
	}

	/**
	 * Does some math
	 */
	public void calc() {
		for (DopplerMethod dopplerMethod : dopplerMethods) {
			System.out.println(dopplerMethod.calcVelocity(1000, 37));
			// Additional information output
			System.out.println(dopplerMethod.isOverLimit(2.0, 1000, 37));
			if (dopplerMethod.isOverLimit(2)) {
				System.out.println("Is over limit");
			} else {
				System.out.println("Is under limit");
			}
		}
	}
}
