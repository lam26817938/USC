/*
 * Written by Lian Liao
 */
public class AppleTester {
	public static void main(String[] args) {
		System.out.println("Welcome to the apple tester\n");
		System.out.println("Creating a default apple");
		Apple apple01 = new Apple();
		System.out.println("Printing the default apple's value");
		System.out.println(apple01);
		
		System.out.println("\nCreating another apple");
		System.out.println("Setting the new apple's values to the following, valid values");
		System.out.println("\"Granny Smith 0.75 0.99\"");
		Apple apple02 = new Apple("Granny Smith", 0.75, 0.99);
		System.out.println("Printing the new apple's values");
		System.out.println(apple02);
		
		System.out.println("\nCreating another defult apple\nThen setting the new apple's values to the following, invalid values \"iPad 2.5 -200\"");
		System.out.println("Printing the newest apple's values which should not have changed from the default values");
		Apple apple03 = new Apple();
		apple03.setType("iPad");
		apple03.setWeight(2.5);
		apple03.setPrice(-200);
		System.out.println(apple03);
		
		System.out.println("\nChecking if the first and last apple have the same values.");
		System.out.println(apple01.equals(apple03));
	}
}
