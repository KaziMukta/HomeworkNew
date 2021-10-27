package hw4Q2Method;
/*Create a package name "hw4Q2Method" in your "HomeWorkOctober2021" project. Inside the package, a) Create a class "Month". Declare one variable -- String monthOfBirth = "YourMonthOfBirthHere" ; . Use switch method. as case use all the months in year and also default to print. Finally execute, your month of Birth as outcome in console. Organize your code. Push in the github. Paste your github link below. (If you are not able to push to github)*/
public class Month {

	public static void main(String[] args) {
        String monthOfBirth ="January";
		
		switch (monthOfBirth) {
		
		case "January":
			System.out.println("I borned in January");
			break;

		case "February":
			System.out.println("I borned in February");
			break;
			
		case "March":
			System.out.println("I borned in March");
			break;	
			
		case "April":
			System.out.println("I borned in April");
			break;	
			
		case "May":
			System.out.println("I borned in May");
			break;	
		
		case "June":
			System.out.println("I borned in June");
			break;
			
		case "July":
			System.out.println("I borned in July");
			break;
			
		case "Auguest":
			System.out.println("I borned in Auguest");
			break;
			
		case "September":
			System.out.println("I borned in September");
			break;
		case "October":
			System.out.println("I borned in October");
			break;
		case "November":
			System.out.println("I borned in November");
			break;
		case "December":
			System.out.println("I borned in December");
			break;
		default:
			System.out.println("Not Found");
			break;
		}
	}

}
