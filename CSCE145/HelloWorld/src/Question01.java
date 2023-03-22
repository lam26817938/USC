/*
 * <<Lian Liao>>
 * CSCE 145 S2021 Exam01 Question01
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
import java.util.Scanner;
public class Question01 {

	public static void main(String[] args) {
		int number;//Used for the triangle's middle
		if(args == null || args.length == 0)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter the value to draw some triangles");
			number = keyboard.nextInt();
			keyboard.nextLine();
		}
		else
		{
			number = Integer.parseInt(args[0]);
		}
//-----------------------------------------------------------------------------------
		if(number <= 0)
		{
			System.out.println("Error Invalid Value");
			System.exit(0);
		}
		//Write your solution here
		String ast="*";
		for(int t=1;t<=3;t++) {
			for(int i=1;i<=number*2*t;i++){		
				if(i>number*t) {
					for(int k=i-number*t;k<number*t;k++){
						System.out.print(ast);
					}
				}else {
					for(int j=1;j<=i;j++){
						System.out.print(ast);
					}
				}
				System.out.println();
			}
		}
		
	}//Do not alter this
//Space for other methods if necessary-----------------------------------------------
	//Write those here if necessary
	
//-----------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * I checked the provided code first and it already has a determination of input is a value or not,
 * so I started to write a single triangle with input high. I thought use three for-loop would be
 * easier to make a triangle, one is outside and two are inside, each inside loop is responsible
 * for a half triangle. I used i to determine where the process is, and which former or latter part
 * should do. I<number*2 because each triangle has number*2 line including a single end-line. By the way,
 * I don¡¦t know I should add a single end-line in the beginning or not because the Question didn¡¦t say it,
 * but the example console looks like have it. After the two inside for-loop, I add a println() to do the next line.
 * Therefore, I finish the single triangle. Finally, I added another for-loop for the second and third triangles.
 * I make it run 3 rounds and t=1~3. Then make every ¡§number¡¨ inside is t times. It would implement as request,
 * and then compile, check the syntax format, and delete unnecessary things.
 */