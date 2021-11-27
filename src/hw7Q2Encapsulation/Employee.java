package hw7Q2Encapsulation;

/* declare some private variables----> name, age, sex, usCitizen. How can you access those variables by getter and setter method? Please execute those variables and print Employee info. Paste the GitHub link below.*/
public class Employee {

	private String name;
	private int age;
	private char sex;
	private boolean usCitizen;

	public void setname(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println(name);
		return name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public int getage() {
		System.out.println(age);
		return age;

	}

	public void setsex(char sex) {
		this.sex = sex;
	}

	public char getsex() {
		System.out.println(sex);
		return sex;
	}

	public void setusCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;

	}

	public boolean getusCitizen() {
		System.out.println(usCitizen);
		return usCitizen;

	}

}
