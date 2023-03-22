/*
 * Written by Lian Liao
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();		
		String play = "", player= "";
		int com = 0 ;
		do{
			System.out.println("Welcome to Rock Paper Scissors! Best 2 out of 3!");
			int t = 0, ct=0;
			for(int i=1;i<=3;i++) {
				System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\"");
				player = keyboard.nextLine();
				com = r.nextInt(3)+1;
				if(player.equals("Rock")) {
					if(com == 1)
						System.out.println("Rock v Rock! Tie!");
					if(com == 2) {
						System.out.println("Rock v Paper! Computer Wins!");
						ct++;
						}
					if(com == 3) {
						System.out.println("Rock v Scissors! Player Wins!");
						t++;
					}					
				}else if(player.equals("Paper")) {
					if(com == 1) {
						System.out.println("Paper v Rock! Player Wins!");
						t++;
						}
					if(com == 2)
						System.out.println("Paper v Paper! Tie!");
					if(com == 3) {
						System.out.println("Paper v Scissors! Computer Wins!");
						ct++;
					}					
				}else if(player.equals("Scissors")) {
					if(com == 1){
						System.out.println("Scissors v Rock! Computer Wins!");
						ct++;
						}
					if(com == 2) {
						System.out.println("Scissors v Paper! Player Wins!");
						t++;
						}
					if(com == 3) {
						System.out.println("Scissors v Scissors! Tie!");		
					}					
				}else {
					System.out.println("Not a valid input! Computer Wins!");
					ct++;
				}
				System.out.println("Player has won " + t + " times and the computer has won "+ ct +" times");
			}	
			if(ct>t) {
				System.out.println("The Computer Wins!");
			}else if(t>ct)
				System.out.println("The Player Wins!");
			else
				System.out.println("Tie!");
				
			System.out.println("Play again? \"Yes\" or \"No\"");
			play = keyboard.nextLine();
		}while(play.equals("Yes"));
		
		System.out.println("Goodbye!");
	}

}
