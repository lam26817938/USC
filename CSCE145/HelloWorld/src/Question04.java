/*
 * <<Lian Liao>>
 * CSCE 145 S2021 Exam01 Question04
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
import java.util.Scanner;
public class Question04 {

	public static double[] array;//The array to be used in the problem
	public static void main(String[] args) {
		if(args == null || args.length == 0)
		{
//-----------------------------------------------------------------------------------
			double[] tempArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};//You may change these values to test your solution
			//double[] tempArray = {92.0, 69.0, 35.0, 27.0, 9.0, 83.0, 89.0};//You may change these values to test your solution
			//double[] tempArray = {1.0, 1.0, 1.0, 1.0, 1.0};//You may change these values to test your solution
//Do not alter-----------------------------------------------------------------------
			array = tempArray;
		}
//-----------------------------------------------------------------------------------
		//Write your solution here
		double ave = 0, above = 0;
		int t = 0;
		for(int i=0;i<array.length;i++) {
			ave = ave + array[i];
		}
		for(int j=0;j<array.length;j++) {
			if(array[j]>ave/array.length) {
				above = above + array[j];
				t = t + 1;
			}
		}
		if(t>0)
			System.out.println("Average Above Average is: " + above/t );
		else
			System.out.println("Average Above Average is: 0.0");
	}//Do not alter this
//Space for other methods if necessary-----------------------------------------------
	//Write those here if necessary
	
//-----------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * First, I declared 2 variables ¡§ave¡¨ and ¡§above¡¨= 0 as double, also a ¡§t¡¨= 0 as int.
 * I made a first for-loop to get the average of every value in the array and store it to ¡§ave¡¨,
 * but actually I just get the sum in that loop. For the next step, made the second for-loop to
 * find that the values are higher than average. Put the ¡§if¡¨ inside set the condition as the value
 * in array higher than average value. If true, add them to get their sum(above) and use ¡¨t¡¨ to get
 * the number of them, so the Above Average is above/t. Finally, set an ¡§if¡¨ to examine if t > 0.
 * If true, then print the answer out. If not, it means there no number higher than average,
 * so print the 0.0 instead of it. In the beginning, I didn¡¦t do the if(t>0) in the last,
 * so if t=0 would have an error, so I add if(t>0).
 */