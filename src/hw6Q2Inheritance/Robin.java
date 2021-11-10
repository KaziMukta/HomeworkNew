package hw6Q2Inheritance;
/* h) Create another class "BullDog". Implement a method inside the class -- bullDogInfo and System.out.println("This method is from BullDog Class"). i) Create another class "Cobra". Implement a method inside the class -- cobraInfo and System.out.println("This method is from Cobra Class"). Now create a class "TestAnimal". Under the main method create an object from each class and call their own method by their own object first. Now extends BullDog, Cobra, and Robin class to their parents class and shows their hierarchy till Animal Class, for example: bulldog -- dog -- mammal --Animal, Cobra -- snake--reptile--Animal, Robin -- Bird -- Animal etc. We know, An object Can call other methods if the class is extended, if yes, show all the possible calls. Use Java comments to show single inheritance, multilevel inheritance, Hierarchical inheritance by example form the above. Also, show by java comments who is Parent class and who is child class for at least one class. Organize the code. Push the code in Github. Paste your github link below.*/
public class Robin extends Birds{
     
	public void robinInfo() {
		System.out.println("This method is from robin class");
	}
}
