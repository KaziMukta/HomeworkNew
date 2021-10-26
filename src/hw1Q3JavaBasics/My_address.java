package hw1Q3JavaBasics;

public class My_address {
	public static String Name = "Kazi Mukta";
	public static int address = 404;
	public static char streetaddress = 'E';
	public static String StreetType = "79st";
	public static String City = "Elmhurst";
	public static short zipcode = 11373;
	public static void my_address() {
	System.out.println("My Name: " + Name + "\n" + address + streetaddress + " " + StreetType + "\n" + City + "\n" + zipcode);
		}
		public static void main(String[] args) {
			my_address();
		}

}
