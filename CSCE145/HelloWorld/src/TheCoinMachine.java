/*
 * Written by Lian Liao
 */
import java.util.Scanner;
public class TheCoinMachine {
	
	public static final int QUARTER = 25;
	public static final int DIME = 10;
	public static final int NICKEL = 5;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a whole number from 1 to 99. The machine will determine a combination of coins.");	
		int val = keyboard.nextInt();
		int valcopy = val;
		
		int q = val / QUARTER;
		val = val % QUARTER;
		
		int d = val / DIME;
		val = val % DIME;
		
		int n = val / NICKEL;
		val = val % NICKEL;
		
		int p = val;
		
		System.out.println(valcopy + " cents in coins:\n" + q + " quarters\n" + d + " dimes\n" + n + " nickels\n" + p + " pennies");

	}
	
}
