/*
 * CSCE 145 S2021 Exam02 Question01
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 */
//Do not alter-----------------------------------------------------------------------
public class Question01 {

	public static void main(String[] args) 
	{
		//Check for Syntax errors in this file
		
		//Question 01 Tests
		System.out.println("Question01 Tests");
		//Testing Class Constant
		System.out.println("The class constant is: "+ Sandwich.PRICE_PER_EXTRA);
		//Declare a new instance of a sandwich
		Sandwich s;
		//Construct it with the default constructor
		System.out.println("Constructing a new instance of Sandwich using the Default Constructor");
		s = new Sandwich();
		//Testing Accessors
		System.out.println("Testing Accessors");
		System.out.println("Name: "+ s.getName());
		System.out.println("Base Price: "+s.getBasePrice());
		System.out.println("Extras: "+s.getExtras());
		//Testing Mutators
		System.out.println("Testing Mutators with Correct Values");
		s.setName("ASDF");
		s.setBasePrice(4.99);
		s.setExtras(2);
		System.out.println("Testing Accessors");
		System.out.println("Name: "+ s.getName());
		System.out.println("Base Price: "+s.getBasePrice());
		System.out.println("Extras: "+s.getExtras());
		System.out.println("Testing Mutators with Incorrect Values");
		s.setName(null);
		s.setBasePrice(-10.00);
		s.setExtras(-14);
		System.out.println("Name: "+ s.getName());
		System.out.println("Base Price: "+s.getBasePrice());
		System.out.println("Extras: "+s.getExtras());
		//Creating another instance of a Pizza using the Param constructor
		System.out.println("Constructing a new instance of Sandwich using the Param Constructor");
		Sandwich s2 = new Sandwich("ASDF2",7.99,4);
		System.out.println("Name: "+ s2.getName());
		System.out.println("Base Price: "+s2.getBasePrice());
		System.out.println("Extras: "+s2.getExtras());
	}
}
//-----------------------------------------------------------------------------------
