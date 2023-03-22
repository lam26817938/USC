/*
 * Written by Lian Liao
 */
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Let・s Coffee!!!1!11!!ONE!!!1!\n");
		System.out.println("What・s the name of the first coffee?");
		String name = keyboard.nextLine();
		System.out.println("What・s the caffeine content?");
		double caffeine = keyboard.nextDouble();
		Coffee coffee01 = new Coffee(name, caffeine);
		
		
		System.out.println("\nWhat・s the name of the second coffee?");
		name = keyboard.next();
		System.out.println("What・s the caffeine content?");
		caffeine = keyboard.nextDouble();
		Coffee coffee02 = new Coffee(name, caffeine);
		System.out.println(coffee01);
		System.out.println(coffee02);
	}

}
