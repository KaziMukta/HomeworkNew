package hw3Q4Constructor;
/*Create a package name "hw3Q4Constructor" in your "HomeWorkOctober2021" project. Inside the package, a) Create a class "Student". Declare some variable -- StName, stID, sex, programmer(as boolean), grade (as float). Declare default constructor and only one parameterized constructor. Use only one System.out.println() in parameterized constructor to declare the above variables. Also, create a parameterized method with all the variables. Create another class TestStudent. Create object as many as you want under the main method. Initialize constructors. I want the first outcome in the console as --> This is from default Constructor of Student class. The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer? Ans: true. Also, initialize the parameterized method and see the outcome. Push in the github. Paste your github */
public class Student {

	public String StName;
	public int stID;
	public char sex;
	public float grade;
	public boolean programmer;
	// This is a default constructor
	public Student() {
		System.out.println("This is from default Constructor of Student class.");
	}
	// This is a parameterize constructor
	public Student(String stName, int stID, char sex, float grade, boolean programmer) {
		this.StName= stName;
		this.stID = stID;
		this.sex = sex;
		this.grade = grade;
		this.programmer = programmer;
		System.out.println("Student Name: "+StName+"\nStudent ID: "+stID+"\nSex: "+sex+"\nGrade: "+
		grade+"\nProgrammer: "+programmer);
	}
	// This is a parameterize method
	public void student(String stName, int stID, char sex, float grade, boolean programmer) {
		this.StName= stName;
		this.stID = stID;
		this.sex = sex;
		this.grade = grade;
		this.programmer = programmer;
		System.out.println("Student Name: "+StName+"\nStudent ID: "+stID+"\nSex: "+sex+"\nGrade: "+
				grade+"\nProgrammer: "+programmer);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
