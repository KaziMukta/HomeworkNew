package hw7Q3Abstraction.copy;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	/*
	 * Interfaces cannot have Constructors.Because method is not implemented. public
	 * Hospital() {
	 * 
	 * }
	 */

// Default constructor is created here.	
	public default void morgue() {
		System.out.println("Default method is implemented here.");
	}
	
// Static Method is created here.	
	public static void pharmacy() { 
		System.out.println("Static method is created");
	}
	
	
	
}
