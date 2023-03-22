/*
 * <<Lian Liao>>
 * CSCE 145 S2021 Exam01 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
import java.util.Scanner;
public class Question03 {

	public static int[] array;//The array to be used in the problem
	public static void main(String[] args) {
		if(args == null || args.length == 0)
		{
//-----------------------------------------------------------------------------------
			int[] tempArray = {39, 93, 26, 62, 13, 31};//You may change these values to test your solution
//Do not alter-----------------------------------------------------------------------
			array = tempArray;
		}
//-----------------------------------------------------------------------------------
		//Write your solution here
		int even=-1,odd=-1;
		for(int i=0;i<array.length;i++) {
			if(array[i]/13>even && array[i]%13==0) {
				even = array[i];
			}
			if(array[i]/31>odd && array[i]%31==0) {
				odd = array[i];
			}
		}
		System.out.println("Max Divisible by 13: "+ even);
		System.out.println("Max Divisible by 31: "+ odd);	
	}//Do not alter this
//Space for other methods if necessary-----------------------------------------------
	//Write those here if necessary
	
//-----------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * I declared ¡§even¡¨ and ¡§odd¡¨ both = -1 initial. It means if no multiples of 13 or 31 in the array.
 * Then made a for-loop to check every value in the array with the array.length. in the for-loop,
 * wrote two ¡§if¡¨ to check 13 parts and 31 parts. I need to make sure two conditions, one is that the
 * value is multiples of 13 or 31, so I use %(mod) to make sure it is. Another one is that make sure
 * it is the biggest so far, so the value in array > even or odd. If true, then even or odd would be
 * the new value. Then I can get both max values divisible by 13 or 31 and print them out. Finally,
 * try every possible array value to test. The results are correct, no errors were encountered. Hence,
 * I thought arrar.length needs parentheses behind it. It showed an error, so I removed it.
 */