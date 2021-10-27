package hw3Q3Constructor;
/*Create a package name "hw3Q3Constructor" in your "HomeWorkOctober2021" project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (grade as char). Declare default constructor and multiple parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class TestComputer. Create object as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as --> This is from default Constructor of Computer class. Second outcome as-- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? Ans: false. I want the third outcome in console for your configuration. (Assume you are a Windows user even you are not). Fourth outcome for 3 variable, 5th outcome for 5 variable. Organize your code. Push in the github. Paste your github link below. (If you are not able to push to github, please paste below)
*/

public class Computer {
	
		// variables are declared below:
		public String Brand;
		public String Model;
		public String OperatingSystem;
		public int price;
		public boolean madeINUSA;
		public char grade;
		
//	Declared default constructor	
		public Computer() { 
			System.out.println("This is from default Constructor of Computer class.");}
			

				
// 	Declared Parameterized constructor:
	
	public Computer(String brand, String model, String operatingSystem, int price,char grade,boolean madeInUSA) {
	this.Brand = brand;
	this.Model = model;
	this.OperatingSystem = operatingSystem;
	this.price = price;
	this.madeINUSA = madeInUSA;
	this.grade = grade;
	
	System.out.println("My Brand: "+Brand+"\nModel: "+Model+"\nOperating System: "+OperatingSystem+"\nprice: "+price+"\ngrade: "+grade+"\nmade IN USA: "+madeINUSA);	
}
   public Computer(String brand, String model, String operatingSystem) {
	   this.Brand = brand;
		this.Model = model;
		this.OperatingSystem = operatingSystem;
		System.out.println("My Brand: "+Brand+"\nModel: "+Model+"\nOperating System: "+OperatingSystem);
   }
   public Computer(String brand, String model, String operatingSystem, int price,char grade) {
		this.Brand = brand;
		this.Model = model;
		this.OperatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		System.out.println("My Brand: "+Brand+"\nModel: "+Model+"\nOperating System: "+OperatingSystem+"\nprice: "+price+"\ngrade: "+grade);
}
}