package hw7Q3Abstraction.copy;

public abstract class MedicalSchool extends NursingSchool {
	/*  How many keywords are used for the inheritance in Java for Abstract Class?
	 Ans: Two. (extends, implements).
	 Can an Abstract Class inherit other Abstract Class or a regular class or interface by extends keyword?
	 Ans: Yes. An abstract class can inherit one abstract class or one regular class by only extends keyword and abstract class can inherit one or more interfaces by only implements keyword.
	 How many inheritances is possible by an Abstract Class?
	Ans: one abstract class or one regular class by only extends keyword and can inherit one or more interfaces by only implements keyword. */
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is a non abstract method");
	}

	// We can create constructor in abstract class
	public MedicalSchool() {
		System.out.println("This constructor is from abstract class of MedicalSchool ");
	}
}
