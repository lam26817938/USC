/*
 * Written by <<Lian Liao>>
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class ShowcaseShowdown {
	static int n = getn();
	static int[] number = new int[n];
	static String[] name = new String[n];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Whelcome to the Showcase Showdown!");
		System.out.println("This game is pick 5 pirze randomly and guess how much are they. If the guess is less than or equal the sum of the prizes and greater than or equal the sum of the prizes minus $2,000, you win!\nDo you want to play?\nPlease enter \"1\" to play\nEnter other number to leave");
		int a = keyboard.nextInt();
		getdata();  //// Get data to array
		
		// interface
		while(a == 1) {
			int[] pick = randnum(); //// get 5 randomly number
			
			// show the items user got
			System.out.println("you got those items:\n--------------------");
			int sum = 0;
			for(int i=0;i<5;i++) {
				System.out.println(name[pick[i]]);
				sum = sum + number[pick[i]];
			}
			System.out.println("--------------------");
			System.out.println("Please guess the value of those item (dollar)");
			int g = keyboard.nextInt();
			
			// Determine if the user won or lost
			if(g <= sum && g >= sum - 2000)
				System.out.println("Congratulations, you win!!!");
			else
				System.out.println("Sorry, the true value is $" + sum + ", you lose:(");
			System.out.println("Do you want to play again\nEnter \"1\" to play again\nEnter other number to leave");
			a = keyboard.nextInt();
		}
		System.out.println("Thank you!");
	}
	
	// get the number of items
	public static int getn() {
		int n = 0;
		try {
			Scanner file = new Scanner(new File("./Prize File.txt"));
			while(file.hasNextLine()) {
				file.nextLine();
				n = n + 1;
			}
			file.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return n;
	
	}
	
	// get 5 randomly number
	public static int[] randnum() {
		Random rand = new Random();
		int[] pick = new int[5];
		for(int i=0;i<5;i++) {
			pick[i] = rand.nextInt(n);
			for(int k=0;k<i;k++) {
				if(name[pick[k]].equals(name[pick[i]])) {
					pick[i] = rand.nextInt(n);
					k = 0;
				}		
			}		
		}
		return pick;
	}
	
	// Get data to array
	public static void getdata() {
		try {
			int j = 0;
			Scanner file = new Scanner(new File("./Prize File.txt"));
			while(file.hasNextLine()) {
				String[] sp = file.nextLine().split("\t");
				if(sp.length == 2) {
					number[j] = Integer.parseInt(sp[1]);  
					name[j] = sp[0];
					j = j + 1;
				}
			}
			file.close();
			n = j;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
