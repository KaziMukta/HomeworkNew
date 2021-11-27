package hw7Q3Abstraction.copy;

public class ColumbiaUniversity extends MedicalSchool {
	/*
	  how many keywords are used for the inheritance in Java for a regular Class? Can a regular Class inherit other Abstract Class or a regular class or interface by extends key word?
	 Answer: Two. (extends, implements)
	   Can a regular Class inherit other Abstract Class or a regular class or interface by extends key word?
	   Answer: Yes. a regular class can inherit one abstract class or one regular class by only extends keyword and a regular class can inherit one or more interfaces by only implements keyword.
	   How many inheritances is possible by a regular Class?
	   Answer: one abstract class or one regular class by only extends keyword and can inherit one or more interfaces by only implements keyword.
	  */
	// This is a regular class where the method is implemented only.
	// public abstract void chemistry();
	
	// This is a non abstract method.
	public void biology() {
		System.out.println("This is a non abstract method of ColumbiaUniversity class");

	}
     
	// We can create a constructor in regular class.
	public ColumbiaUniversity() {
		System.out.println("This is a constructor of ColumbiaUniversity class");
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

}
