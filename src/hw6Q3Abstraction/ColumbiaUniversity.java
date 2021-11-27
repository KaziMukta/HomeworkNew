package hw6Q3Abstraction;
/* Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? Create another regular Class NYUniversity, create 2 methods inside the class - one is abstract and another one is non-abstract name -- anthropology and physics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? Create another regular Class RockefellerUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- maths and statistics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not?*/

public class ColumbiaUniversity {

	// This is a regular class where the method is implemented only.
	// public abstract void chemistry();
	public void biology() {
		System.out.println("This is a non abstract method of ColumbiaUniversity class");

	}

	public ColumbiaUniversity() {
		System.out.println("This is a constructor of ColumbiaUniversity class");
	}

}
