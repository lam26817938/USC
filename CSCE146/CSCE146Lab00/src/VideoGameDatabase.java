/*
 * Written by Lian Liao
 */
import java.util.Scanner;
import java.io.*;
public class VideoGameDatabase {
	
	static Linklist<String> game = new Linklist<String>();
	static Linklist<String> result = new Linklist<String>();
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Whelcome to the Video Game Database!");
		boolean leave = true;
		while(leave) {	
			gretting();
			int c = keyboard.nextInt();
			switch(c) {
			case 1:   	 //Loading a Video Game File
				game.reset();
				System.out.println("Which file do you want to read");
				String a = keyboard.next();
				getdata(a);
				game.print();
				break;
			case 2: 	 //Searching the Database just read
				result.reset();
				search();
				result.print();
				break;
			case 3:		//Searching the Database
				game.reset();
				result.reset();
				System.out.println("Which file do you want to search");
				String b = keyboard.next();
				getdata(b);
				search();
				result.print();
				break;
			case 4:		//Printing the Results to a File(overwrite)
				System.out.println("The file name you want to overwirite or creat");
				wirte();
				break;
			case 5:		//Printing the Results to a File(append)
				System.out.println("The file name you want to append");
				wirteappend();
				break;
			case 9:
				leave = false;
				break;
			}
		}
		System.out.println("Thank you");
	}
	
	public static void getdata(String name) {
		try {
			Scanner file = new Scanner(new File("./" + name));
			while(file.hasNextLine()) {
				game.add(file.nextLine());
			}
			file.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//interface
	public static void gretting() {
		System.out.println("\nPlease enter 1 to read file");
		System.out.println("Please enter 2 to search the file you just read");
		System.out.println("Please enter 3 to search the file");
		System.out.println("Please enter 4 to wirte the search from last time to a file");
		System.out.println("Please enter 5 to append the search from last time to a file");
		System.out.println("Please enter 9 to leave");
	}
	public static void search() {
		game.re();
		System.out.println("which games you want to search?");
		String g =  keyboard.next();
		System.out.println("which consoles you want to search?");
		String c =  keyboard.next();
		for(int i=0;i<game.getSize();i++) {
			if(game.match(g, c) != null) {
				result.add(game.match(g, c));
			}
			game.gotoNext();
		}
	}
	public static void wirte() {
		System.out.println("which file you want to write?");
		String name = keyboard.next();
		try {
			PrintWriter filewriter = new PrintWriter(new FileOutputStream(name));
			while(result.hasMore()) {
				filewriter.println(result.getCurrent());
				result.gotoNext();
			}
			filewriter.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Complete writing");
	}
	public static void wirteappend() {
		System.out.println("which file you want to write?");
		String name = keyboard.next();
		try {
			FileWriter fileWriter = new FileWriter(name, true);
			while(result.hasMore()) {
				fileWriter.write(result.getCurrent() + "\n");
				result.gotoNext();
			}
			fileWriter.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Complete writing");
	}
}
