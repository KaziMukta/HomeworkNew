package hw6Q3Abstraction;
/*Create a package name "hw6Q3Abstraction" inside your HW project. Inside the package, a) Create an interface "University". Declare some methods inside the interface named--> classSize, playGround, and teacher. b) Create another interface "Hospital". Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria. c) Create another interface "College". Declare some methods inside the interface - commonRoom, laboratory, languageClub. Now, Can you create a Constructor inside the interface? If yes, create default Constructor on one interface. If no, comment out the 'created constructor' and answer why not?*/

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

}
