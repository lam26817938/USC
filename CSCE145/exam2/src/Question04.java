/*
 * CSCE 145 S2021 Exam02 Question04
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 */
//Do not alter-----------------------------------------------------------------------
public class Question04 {
	public static void main(String[] args)
	{
		System.out.println("Creating a new instance of a pineapple pizza, and printing out its default values.");
		PineapplePizza pineapplePizza01 = new PineapplePizza();
		System.out.println("Location: "+pineapplePizza01.getLocation()+" Pineapple Amount: "+pineapplePizza01.getPineappleAmount()+" kg");
		System.out.println("Checking to see if Pineapple Pizza inherits from Pizza");
		Pizza p = pineapplePizza01;//This will cause a syntax error if it does not inherit from Piano
		System.out.println("Creating another instance of a pineapple pizza via the parameterized constructor, and printing out its values.");
		PineapplePizza pineapplePizza02 = new PineapplePizza("ASDF",55);
		System.out.println("Location: "+pineapplePizza02.getLocation()+" Pineapple Amount: "+pineapplePizza02.getPineappleAmount()+" kg");
		System.out.println("Checking the equals method with 2 pizzas with different values");
		System.out.println("Are the equal?: "+pineapplePizza01.equals(pineapplePizza02));
		System.out.println("Checking the equals method with 2 pizzas with same values");
		System.out.println("Are the equal?: "+pineapplePizza01.equals(new PineapplePizza()));
		System.out.println("Checking the equals method with a null pizza");
		System.out.println("Are the equal?: "+pineapplePizza01.equals(null));
	}
}
//-----------------------------------------------------------------------------------