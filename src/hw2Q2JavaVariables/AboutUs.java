package hw2Q2JavaVariables;

public class AboutUs {
	// variables are declared below:
		public String Name;
		public int age;
		public char sex;
		public boolean citizen;
		public short zipCode;
		public long salary;
		public float grade;
		public double speed;
		public byte reminingDays;

	// constructor is created:
		public AboutUs() {
			System.out.println("This is all about me:");
		}

	// aboutUs method is created:	
		public void aboutUs() {
			System.out.println("My Name: " + Name + "\nAge: " + age + "\nSex: " + sex + "\nUs Citizen: " + citizen
					+ "\nZipCod :" + zipCode + "\nMy Salarey: " + salary + "\nMy Grade: " + grade + "\nCar Speed: " + speed
					+ "\nHome Work: " + reminingDays);
		}

}
