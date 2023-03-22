/*
 * Written by Lian Liao
 */
import java.util.Scanner;
public class PBJFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);		
		System.out.println("-----------------------------------\nWelcome to the PBJ Sandwich Maker!");
		System.out.println("-----------------------------------\n-----Sandwich 1-----");
		System.out.println("Top Slice of Bread Information\nEnter name of the bread");
		String b1 = keyboard.nextLine();
		System.out.println("Enter the number of calories");
		int b2 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
		String b3 = keyboard.nextLine();
		System.out.println("Peanut Butter Information\nEnter name of the peanut butter");
		String p1 = keyboard.nextLine();
		System.out.println("Enter the number of calories");
		int p2 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Is it crunchy? Enter \"true\", or \"false\"");
		String p3 = keyboard.nextLine();
		System.out.println("Jelly Information\nEnter name of the jelly");
		String j1 = keyboard.nextLine();
		System.out.println("Enter the number of calories");
		int j2 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter the type of bread. Must be \"Apple\", \"Blueberry\", \"Grape\", \"Strawberry\", or \"Tomato\"");
		String j3 = keyboard.nextLine();
		System.out.println("Bottom Slice of Bread Information\nEnter name of the bread");
		String b4 = keyboard.nextLine();
		System.out.println("Enter the number of calories");
		int b5 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
		String b6 = keyboard.nextLine();
		
		PBJSandwich S1 = new PBJSandwich(b1,b2,b3,p1,p2,p3,j1,j2,j3,b4,b5,b6); 
		
		System.out.println("\n-----Sandwich 2-----");
		System.out.println("Top Slice of Bread Information\nEnter name of the bread");
	    b1 = keyboard.nextLine();
		System.out.println("Enter the number of calories");
		 b2 = keyboard.nextInt();
		 keyboard.nextLine();
		System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
		 b3 = keyboard.nextLine();
		System.out.println("Peanut Butter Information\nEnter name of the peanut butter");
		 p1 = keyboard.nextLine();
		System.out.println("Enter the number of calories");
		 p2 = keyboard.nextInt();
		 keyboard.nextLine();
		System.out.println("Is it crunchy? Enter \"true\", or \"false\"");
		 p3 = keyboard.nextLine();
		System.out.println("Jelly Information\nEnter name of the jelly");
		 j1 = keyboard.nextLine();
		System.out.println("Enter the number of calories");
		 j2 = keyboard.nextInt();
		 keyboard.nextLine();
		System.out.println("Enter the type of bread. Must be \"Apple\", \"Blueberry\", \"Grape\", \"Strawberry\", or \"Tomato\"");
	     j3 = keyboard.nextLine();
		System.out.println("Bottom Slice of Bread Information\nEnter name of the bread");
		b4 = keyboard.nextLine();
		System.out.println("Enter the number of calories");
		 b5 = keyboard.nextInt();
		 keyboard.nextLine();
		System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
		 b6 = keyboard.nextLine();
		
		PBJSandwich S2 = new PBJSandwich(b1,b2,b3,p1,p2,p3,j1,j2,j3,b4,b5,b6); 
		System.out.println("-----Sandwich 1-----\n" + S1 + "\n-----Sandwich 2-----\n" + S2);
		System.out.println("\nAre they the same sandwich? " + S1.equals(S2));
	}

}
