package hw7Q3Abstraction.copy;


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


 
