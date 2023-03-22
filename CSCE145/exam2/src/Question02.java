/*
 * CSCE 145 S2021 Exam02 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 */
//Do not alter-----------------------------------------------------------------------
public class Question02 {

	public static void main(String[] args) 
	{
		//Check for Syntax errors in this file		
		//Question 02 Tests
		//Construct it with the default constructor
		System.out.println("Constructing 2 instances of Sandwich using the Default Constructor");
		Sandwich s = new Sandwich();
		Sandwich s2 = new Sandwich();		

		//Testing Equals method
		System.out.println("Testing Equals Method with 2 Sandwiches that have the same properties");
		System.out.println("Are they equal? "+s.equals(s2));
		System.out.println("Setting values of Sandwich 2 to have different values.\nTesting Equals Method with 2 Sandwiches that have different properties");
		s2.setName("ASDF");
		s2.setBasePrice(5.00);
		s2.setExtras(11);
		
		System.out.println("Are they equal? "+s.equals(s2));
		System.out.println("Setting value of Sandwich 2 to null.\nTesting Equals Method with 2 Sandwiches where one is null");
		s2 = null;
		System.out.println("Are they equal? "+s.equals(s2));
		
		//Testing get total price method
		System.out.println("Testing Get Total Price method.\nResetting Sandwich 2");
		s2 = new Sandwich("ASDF",5.00,11);
		System.out.println("Sandwich 2's total price is: " + s2.getTotalPrice());
		
		//Testing toString Method
		System.out.println("Testing the toString Method on Sandwich 2");
		System.out.println(s2);
		
		//Testing Most Expensive method
		System.out.println("Testing Most Expensive Method with Sandwich 1 and Sandwich 2");
		System.out.println(Sandwich.mostExpensive(s, s2));
		System.out.println("Testing Most Expensive Method with Sandwich 1 and null");
		System.out.println(Sandwich.mostExpensive(s, null));
		System.out.println("Testing Most Expensive Method with null and null");
		System.out.println(Sandwich.mostExpensive(null, null));
	}

}
//-----------------------------------------------------------------------------------