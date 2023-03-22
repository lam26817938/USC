/*
 * Written by Lian Liao
 */
import java.util.Scanner;
import java.util.Random;
public class DiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random(1);
		System.out.println("Enter the number of times a 6 sided die should be rolled");
		int time = keyboard.nextInt();
		if(time>0) {
			int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, roll;
			for(int i=1;i<=time;i++) {
				roll = r.nextInt(6) + 1;
				if(roll==1)
					one++;
				if(roll==2)
					two++;
				if(roll==3)
					three++;
				if(roll==4)
					four++;
				if(roll==5)
					five++;
				if(roll==6)
					six++;
				
				System.out.println(roll + " was rolled");
			}	
			System.out.println("One: "+ one);
			System.out.println("Two: "+ two);
			System.out.println("Three: "+ three);
			System.out.println("Four: "+ four);
			System.out.println("Five: "+ five);
			System.out.println("Six: "+ six);
			
		}else {
		System.exit(0);
		}
	}
}
