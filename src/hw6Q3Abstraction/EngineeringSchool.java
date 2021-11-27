package hw6Q3Abstraction;

/*Create another Abstract Class EngineeringSchool, create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. Print something inside the non abstract or implemented method . Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method. Can you create a Constructor inside Abstract Class? If yes, create default Constructor on one of the Abstract Class. If no, comment out the created constructor and answer why not?*/
public abstract class EngineeringSchool implements College,University{
	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is non abstract method");

	}

	// We can create constructor in abstract class
	public EngineeringSchool() {
		System.out.println("This constructor is from abstract class of EngineeringSchool ");
	}
}

// Questions: How many a regular class can inherit by abstract class by using implements keyword ?
// 
// 