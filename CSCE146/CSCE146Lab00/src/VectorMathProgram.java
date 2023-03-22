/*
 * Written by <<Lian Liao>>
 */
import java.util.Scanner;
public class VectorMathProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Whelcome to the vector calculatior");
		int s = 0;
		while(true) {
			//Interface
			System.out.println("Which functions do you want to use?\nPlease Enter \"1\" for Adding\nEnter \"2\""
				+ " for Subtracting\nEnter \"3\" for finding the Magnitude\nEnter \"0\" to exit");
			s = keyboard.nextInt();
			//Leave
			if(s == 0) 	
				break;	
			if(s<0 || s>3) {
				System.out.println("The value is not valid");
				s=-1;
			}
			//get in function
			while(s>0) {
				// Get two vectors for Adding and Subtracting
				System.out.println("Please enter the size of vector");
				int size = keyboard.nextInt();
				if(s == 1 || s == 2) {
					double[] array1 = new double[size];
					double[] array2 = new double[size];
					for(int i=0;i<array1.length;i++) {
						System.out.println("Please enter the first vector value " + (i+1));
						array1[i] = keyboard.nextDouble();
					}
					for(int i=0;i<array2.length;i++) {
						System.out.println("Please enter the second vector value " + (i+1));
						array2[i] = keyboard.nextDouble();
					}
					//Adding 
					if(s==1) {
						double add = array1[0] + array2[0];
						System.out.print("the vector after adding:(" + add);
						for(int i=1;i<array1.length;i++) {
							add = array1[i] + array2[i];
							System.out.print(", " + add);
						}
						System.out.println(")\n");
					}
					//Subtracting 
					if(s==2) {
						double add = array1[0] - array2[0];
						System.out.print("the vector after subtracting :(" + add);
						for(int i=1;i<array1.length;i++) {
							add = array1[i] - array2[i];
							System.out.print(", " + add);
						}
						System.out.println(")\n");
					}
				}
				//Magnitude of a Vector
				if(s == 3) {
					double[] array = new double[size];
					for(int i=0;i<array.length;i++) {
						System.out.println("Please enter the vector value " + (i+1));
						array[i] = keyboard.nextDouble();
					}
					double sum = 0;
					for(int i=0;i<array.length;i++) {
						sum = sum + Math.pow(array[i],2);
					}
					System.out.println("Magnitude of a Vector: " + Math.round(Math.sqrt(sum)*100)/100.0 + "\n");
				}
				break;
			}
		}
		System.out.println("Thank you!");
	}
}
