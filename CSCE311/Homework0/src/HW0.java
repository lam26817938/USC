/*
 * Written by Lian Liao
 */
import java.io.*;
import java.util.Scanner;
public class HW0 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//read question file
		File doc = new File("Questions.txt");
		Scanner obj = new Scanner(doc);
		//read answer file
		File doc2 = new File("Answers.txt");
		Scanner obj2 = new Scanner(doc2);
		try {
			//write solution file
		      FileWriter sol = new FileWriter("Solution.txt");
		      while (obj.hasNextLine()) {
		    	  sol.write(obj.nextLine() + "\n");
		    	  sol.write(obj2.nextLine() + "\n");
		      }
		      //close every files
		      sol.close();
		      obj.close();
		      obj2.close();
		} 
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		//Finish
		System.out.println("Files Merge and Mesh successfully, please check out Solution.txt");
	}

}