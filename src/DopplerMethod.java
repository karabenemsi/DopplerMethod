
/**
 * @author Ronny
 *
 */
public class DopplerMethod {
	// Attribute
	private double speedOfSound;
	private double transFrequency;
	// Only need this if keeping isOverLimit v1 (one param)
	private double velocity;

	// Two constructors
	/**
	 * Creates a class to calculate the speed of blood with the doppler method
	 * 
	 * @param transFrequency in Hz. Transmission frequency of your device
	 */
	DopplerMethod(double transFrequency) {
		this.transFrequency = transFrequency;
		this.speedOfSound = 1540.0;
	};

	/**
	 * Creates a class to calculate the speed of blood with the doppler method
	 * 
	 * @param speedOfSound in m/s. The Speed of sound inside the human body
	 * @param transFrequency in Hz. Transmission frequency of your device
	 */
	DopplerMethod(double transFrequency, double speedOfSound) {
		this.speedOfSound = speedOfSound;
		this.transFrequency = transFrequency;
	}

	/**
	 * calculates the blood velocity using the doppler method
	 * 
	 * @param dopplerShift
	 * @param alpha
	 * @return The speed of blood in m/s
	 */
	double calcVelocity(double dopplerShift, double alpha){
		this.velocity = (dopplerShift * this.speedOfSound)/(this.transFrequency*2*Math.cos(alpha)); 
		return this.velocity;
	}
	
	/**
	 * Gets velocity via class attribute (does not directly call calcVelocity)
	 * 
	 * @param velocityLimit in m/s. The maximum speed the blood should flow
	 * @return True if velocity is over limit
	 */
	public boolean isOverLimit(double velocityLimit) {
		return this.velocity > velocityLimit;
	}
	
	/**
	 * Pass velocity via a second parameter, you need to call calcVelocity inside App.java
	 * 
	 * @param velocityLimit
	 * @param velocity
	 * @return
	 */
	public boolean isOverLimit(double velocityLimit, double velocity) {
		return velocity > velocityLimit;
	}
	
	/**
	 * Pass all necessary infos as parameters, calls calcVelocity directly
	 * 
	 * @param velocityLimit
	 * @param dopplerShift
	 * @param alpha
	 * @return
	 */
	public boolean isOverLimit(double velocityLimit, double dopplerShift, double alpha) {
		return this.calcVelocity(dopplerShift, alpha) > velocityLimit;
	}
	

	/**
	 * @return
	 */
	public double getSpeedOfSound() {
		return speedOfSound;
	}

	/**
	 * @param speedOfSound
	 */
	public void setSpeedOfSound(double speedOfSound) {
		this.speedOfSound = speedOfSound;
	}

	/**
	 * @return
	 */
	public double getTransFrequency() {
		return transFrequency;
	}

	/**
	 * @param transFrequency
	 */
	public void setTransFrequency(double transFrequency) {
		this.transFrequency = transFrequency;
	}
	
	
	
}
