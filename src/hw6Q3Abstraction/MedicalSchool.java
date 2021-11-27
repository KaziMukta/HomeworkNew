package hw6Q3Abstraction;
/*3-2) (Continue from above inside same package) d) Create an Abstract Class MedicalSchool, create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- anatomyLab and biochemistryLab. Print something inside the non abstract or implemented method. Create another Abstract Class EngineeringSchool, create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. Print something inside the non abstract or implemented method . Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method. Can you create a Constructor inside Abstract Class? If yes, create default Constructor on one of the Abstract Class. If no, comment out the created constructor and answer why not?*/

public abstract class MedicalSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is a non abstract method");
	}

	// We can create constructor in abstract class
	public MedicalSchool() {
		System.out.println("This constructor is from abstract class of MedicalSchool ");
	}
}
