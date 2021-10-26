package hw3Q2variableAndMethod;
/*Create a package name "hw3Q2variableAndMethod" in your "HomeWorkOctober2021" project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Implement a method inside the class NAME-- "configuration" and use only one System.out.println(). Use the declared variables inside sysout. Create another class TestComputer. Create object from Computer class under main method. Initialize all object and 'configuration' method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? Ans: false. I want second outcome in console for your configuration (Assume you are a Windows user even you are not). So, Total 2 outcome is expecting from the test class. Organize your code. Push in the github. Paste your github link below. (If you are not able to push to github, please paste below)*/
 

public class TestComputer {
public static void main(String[]args) {
	Computer connect= new Computer();
	connect.Brand="Apple";
	connect.Model="MacBook Air";
	connect.OperatingSystem="MacOs Mojava";
	connect.price=800;
	connect.grade='C';
	connect.madeInUSA= false;
	connect.configuration();
	System.out.println("********************************");
	Computer myComputer= new Computer();
	myComputer.Brand="Windows";
	myComputer.Model="Window 10";
	myComputer.OperatingSystem="Windows 11";
	myComputer.price=900;
	myComputer.grade='b';
	myComputer.madeInUSA= true;
	myComputer.configuration();
			
	
	
	
}
}
