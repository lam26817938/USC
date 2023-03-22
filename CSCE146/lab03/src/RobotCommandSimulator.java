/*
 * Written by Lian Liao
 */
import java.util.Scanner;
import java.io.*;
public class RobotCommandSimulator {

	static Scanner keyboard = new Scanner(System.in);
	static Queue<String> command = new Queue<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int leave = 1;
		//interface
		while(leave == 1) {
			System.out.println("Whelcome to the Robot Command Simulator!");		
			StringBuffer[] board = getboard(); //Loading a Board File
			int n = getcommand();  //Loading a Robot Command File
			// set and print the initial board
			board[0] = board[0].replace(0,1,"O");
			printboard(board);
			//queue
			move(board,n); 
			leave = again();
			keyboard.nextLine();
		}
		System.out.println("Thank you!");	
	}
	//Loading a Board File
	public static StringBuffer[] getboard() {
		System.out.println("Please enter the name of board file");
		String name = keyboard.nextLine();
		StringBuffer[] ret = new StringBuffer[10];
		try {
			Scanner file = new Scanner(new File("./" + name));
			for(int i=0;i<10;i++) {
				ret[i] = new StringBuffer().append(file.nextLine());
			}
			file.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ret;
	}
	//Print the current board
	public static void printboard(StringBuffer[] result) {
		for(int i=0;i<10;i++)
			System.out.println(result[i]);
	}
	//Loading a Robot Command File
	public static int getcommand() {
		System.out.println("Please enter the name of command file");
		String name = keyboard.nextLine();
		int n = 0;
		try {
			Scanner file = new Scanner(new File("./" + name));
			while(file.hasNextLine()) {
				command.enqueue(file.nextLine());
				n = n + 1;
			}
			file.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	//interface
	public static int again() {
		System.out.println("\nDo you want to play again?");
		System.out.println("Enter 1 to play again");
		System.out.println("Enter others to leave");
		int ret = keyboard.nextInt();
		return ret;
	}
	//dequeue
	public static void move(StringBuffer[] board,int n) {
		int a = 0,b = 0,i = 0;
		boolean exit = false;
		while(i<n) {
			System.out.println("step " + (i+1));
			String com = command.dequeue();
			System.out.println(com);
			board[a] = board[a].replace(b,b+1,"_");
			switch(com) {
				case "Move Right":
					b++;
					if(a<0 || a>9 || b>9 || b<0) {
						exit = true;
						break;
					}
					if(board[a].charAt(b)=='X')
						exit = true;
					break;
				case "Move Left":
					b--;
					if(a<0 || a>9 || b>9 || b<0) {
						exit = true;
						break;
					}
					if(board[a].charAt(b)=='X')
					exit = true;	
					break;
				case "Move Down":
					a++;
					if(a<0 || a>9 || b>9 || b<0) {
						exit = true;
						break;
					}
					if(board[a].charAt(b)=='X')
						exit = true;
					break;
				case "Move Up":
					a--;
					if(a<0 || a>9 || b>9 || b<0) {
						exit = true;
						break;
					}
					if(board[a].charAt(b)=='X')
						exit = true;
					break;
			}
			if(exit) {
				System.out.println("CRASH!");
				break;
			}
			board[a] = board[a].replace(b,b+1,"O");
			printboard(board);
			i++;
		}
	}
}
