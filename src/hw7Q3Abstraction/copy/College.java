package hw7Q3Abstraction.copy;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	/*
	 * Interfaces cannot have Constructors.Because method is not implemented. public
	 * College() {
	 * 
	 * }
	 */

//Default method is created.	
	public default void dorm() {
		System.out.println("Default method is implemented here.");
	}
	
//Static Method is created.
	public static void studyRoom () {
		System.out.println("This is a static method.");
	}
	
	
}
