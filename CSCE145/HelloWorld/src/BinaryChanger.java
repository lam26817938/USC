/*
 * Written by Lian Liao
 */
import java.util.Scanner;
public class BinaryChanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a 4-bit binary number");
		Scanner keyboard = new Scanner(System.in);
		String number1 = keyboard.nextLine();
		
		int deci1 = 0;
		for(int i=0;i<=3;i++) {
		if(number1.charAt(i) % 2 == 1)
		deci1 = deci1 + (int)Math.pow(2,3-i);
		}
		
		System.out.println("Enter another 4-bit binary number");
		String number2 = keyboard.nextLine();
		int deci2 = 0;
		for(int i=0;i<=3;i++) {
			if(number2.charAt(i) % 2 == 1)
			deci2 = deci2 + (int)Math.pow(2,3-i);
		}
		
		System.out.println("The first number is " + deci1);
		System.out.println("The second number is " + deci2);
		System.out.println("Added together is " + (deci1 + deci2));
	}

}
