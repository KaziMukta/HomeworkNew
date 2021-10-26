package hw2Q2JavaVariables;

public class TestAboutUS {
	// main method is created:
		public static void main(String[] args) {
	// AboutUs class is instantiated:
	// AboutUs class constructor is declared here:
			AboutUs myInfo = new AboutUs();
	// variables are initialized: 
			myInfo.Name = "Kazi Mukta";
			myInfo.age = 30;
			myInfo.sex = 'f';
			myInfo.citizen = true;
			myInfo.zipCode = 10472;
			myInfo.salary = 1180000l;
			myInfo.grade = 5.0000000f;
			myInfo.speed = 80.12345678;
			myInfo.reminingDays = -2;

			// aboutUs method is initialized here:
			myInfo.aboutUs();
	System.out.println("*************************************************************");		
			
			AboutUs friendInfo = new AboutUs();
			// variables are initialized: 
					friendInfo.Name = "Roksana";
					friendInfo.age = 30;
					friendInfo.sex = 'f';
					friendInfo.citizen = true;
					friendInfo.zipCode = 11103;
					friendInfo.salary = 1100000;
					friendInfo.grade = 4.0000000f;
					friendInfo.speed = 85.12345678;
					friendInfo.reminingDays = -2;

					// aboutUs method is initialized here:
					friendInfo.aboutUs();
							
			
		}



}
