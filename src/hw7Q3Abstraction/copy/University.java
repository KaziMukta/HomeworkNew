package hw7Q3Abstraction.copy;


public interface University extends College,Hospital {
	/*
	 * i) how many keywords are used for the inheritance in Interface ?
	 *  Ans: One(extends). 
	 * Can an interface inherit other Interfaces, or a regular class or
	 * abstract class by extends key word? How many inheritance is possible? 
	 * Ans:Yes, Interface can only inherits one or more interfaces by extends keywords
	 * but can't inherit regular class or abstract class by extends keyword. default
	 * method public default void gymnasium() {
	 * System.out.println("This is a default method of Interface(University)"); }
	 */
	public void classSize();

	public void playGround();

	public void teacher();

	/*
	 * Interfaces cannot have Constructors.Because method is not implemented. public
	 * University() {
	 * 
	 * }
	 */

// Default method is created here.	
	
	public default void gymnasium() {
		System.out.println("Default method is implemented here.");
		
	}
	
//Static method is created here.	
	
	public static void library() {
		System.out.println("This is a static method.");
	}
	
	


	
}
