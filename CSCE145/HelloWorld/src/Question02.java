/*
 * <<Lian Liao>>
 * CSCE 145 S2021 Exam01 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
import java.util.Scanner;
public class Question02 {

	public static void main(String[] args) {
		Scanner keyboard;
		if(args == null || args.length == 0)
		{
			keyboard = new Scanner(System.in);
			System.out.println("Welcome to the consonant counter program! I will count the number of consonants in a word.");
		}
		else
		{
			keyboard = new Scanner(args[0]);
		}
//-----------------------------------------------------------------------------------
		//Write your solution here
		String in = keyboard.nextLine();
		int total=0;
		for(int i=0;i<in.length();i++) {
			if(in.charAt(i)!='a' && in.charAt(i)!='e'&& in.charAt(i)!='i'&& in.charAt(i)!='o'&& in.charAt(i)!='u'&& in.charAt(i)!='A'&& in.charAt(i)!='E'&& in.charAt(i)!='I'&& in.charAt(i)!='O'&& in.charAt(i)!='U') {
				total=total + 1;
			}
		}
		System.out.println("The number of consonants is: " + total);
	}//Do not alter this
//Space for other methods if necessary-----------------------------------------------
	//Write those here if necessary
	
//-----------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * I declare a variable to store input as String. Also declare a variable to be counter of consonants as Int. In order to check every character,
 * I made a for-loop with the length of ¡§in¡¨ rounds. Then used if to determine if it is consonants or not. Use charAt(i) to get the current character
 * and it can not be equal to a, e, I, o, u, A, E, I, O, and U, so use && to examine ten of them. If the character is not one of them,
 * then the counter total + 1. Finally, just print it out. This question assumes that input is only letters and no other characters,
 * so I did it this way. Otherwise, it should determine that the input is all letters and delete all space first. That will be more
 * complicated if determine so many things. I don¡¦t have any error encounter in this question.
 */