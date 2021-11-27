package hw6Q3Abstraction;
/*Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method. Can you create a Constructor inside Abstract Class? If yes, create default Constructor on one of the Abstract Class. If no, comment out the created constructor and answer why not?*/

public abstract class NursingSchool {
	public abstract void hygiene();

	public void caring() {
		System.out.println("Non Abstract method is implemented");

	}

	// We can create constructor in abstract class
	public NursingSchool() {
		System.out.println("This constructor is from abstract class of NursingSchool ");
	}

}
