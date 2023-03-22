/*
 * Written by Lian Liao
 */
import java.util.Scanner;
public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to UofSC admission, please choose your level you want to apply:\"Undergraduate\" or \"Graduate\" ");
		String re = keyboard.nextLine();
		boolean yes = false;
		
		if(re.equals("Undergraduate")) {
			System.out.println("You chose undergraduate, which way are you applying? Enter \"Freshman\", \"Transfer\", or \"International\"");
			re = keyboard.nextLine();
			System.out.println("Thanks for applying undergraduate as " + re + " student in UofSC, How is your GPA?");
			if(keyboard.nextDouble() >= 2.6 && keyboard.nextDouble() < 4) {
				System.out.println("Here is your "+ re + " undergraduate application, fill it up!");
			}else {
				System.out.println("Sorry, your GPA doesn't reach the minimum of requirement or not value, Do you have any other question? Enter \"Yes\" or \"No\"");
				if(keyboard.next().equals("Yes"))
					yes = true;
			}
				
		}else if(re.equals("Graduate")){
			System.out.println("You chose Graduate, which way are you applying? Enter \"Freshman\", \"Transfer\", or \"International\"");
			re = keyboard.nextLine();
			System.out.println("Thanks for applying graduate as " + re + " student in UofSC, How is your GPA?");
			if(keyboard.nextDouble() >= 3 && keyboard.nextDouble() < 4) {
				System.out.println("Here is your "+ re + " graduate application, fill it up!");
			}else {
				System.out.println("Sorry, your GPA doesn't reach the minimum of requirement or not value, Do you have any other question? Enter \"Yes\" or \"No\"");
				if(keyboard.next().equals("Yes"))
					yes = true;
			}
			
		}else {
		System.out.println("Sorry, your answer is unaccepting");
		}
		if(yes)
			System.out.println("Please leave the question here.");
		else
			System.out.println("Thank you for your interest in UofSC.");
		System.out.println("THE END");
	}

}
