package hw7Q3Abstraction.copy;

public abstract class NursingSchool {
	public abstract void hygiene();

	// This a non abstract method.
	public void caring() {
		System.out.println("Non Abstract method is implemented");

	}

	// We can create constructor in abstract class
	public NursingSchool() {
		System.out.println("This constructor is from abstract class of NursingSchool ");
	}

}
