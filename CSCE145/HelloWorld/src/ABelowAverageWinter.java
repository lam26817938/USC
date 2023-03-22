/*
 * Written by Lian Liao
 */
import java.util.Scanner;
public class ABelowAverageWinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the below average temperature tester program.\n");
		double[] arr = new double[10];
		double total=0;
		for(int i=0;i<10;i++) {
			System.out.println("Please enter the temperature for day "+ (i+1));
			arr[i] = keyboard.nextDouble();
			total = total + arr[i];
		}
		System.out.println("The average temperature was "+ total/10);
		System.out.println("The days that were below average were");
		for(int j=0;j<10;j++) {
			if((total/10)>arr[j])
			System.out.println("Day " + (j+1) + " with " + arr[j]);
		}
	}

}
