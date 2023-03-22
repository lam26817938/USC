/*
 * Written by Lian Liao
 */
import java.io.*;
import java.util.*;
public class WorkshopManager {


	public static void main(String[] args) throws FileNotFoundException, IOException{
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		int[][] all = inter("Allocation",key);
		int[][] req = inter("Requests",key);
		int[] avail = ava(key);
		String seq="";
		int check=-1;
		ArrayList<Integer> g = new ArrayList<Integer>();
		
		// Check for deadlcok
		while(g.size()<all[0].length && g.size()!= check) {
			check = g.size();
		for(int i=0;i < all[0].length;i++) {
			for(int j=0;j < all.length;j++) {
				if(req[j][i]>avail[j] || g.contains(i)) {
					break;
				}
				else if(j==all.length-1){
					seq=seq+"P"+i+"-->";
					g.add(i);
					for(int r=0;r<avail.length;r++) {
						avail[r]+=all[r][i];
					}
				}
			  }
		  }
		
		// print the result
		}
		System.out.println(seq);
		if(g.size()<all[0].length) {
			System.out.println("Deadlock!");
		}else {
			System.out.println("Safe");
		}

		
	}
	//interface for Allocation and Requests file
	public static int[][] inter(String name,Scanner key) throws FileNotFoundException, IOException{
		System.out.println("Please enter the "+ name + " fil name or enter \"q\" to leave.");
		String input=key.nextLine();
		if(input.equalsIgnoreCase("q")) {
			System.exit(0);
		}
		String file = input;
		File obj = new File(file);
		Scanner all = new Scanner(obj);
		int m=all.nextInt();
		int n=all.nextInt();
		int[][] allarr = new int[n][m];
		for(int i=0;i < m;i++) {
			for(int j=0;j<n;j++) {
				allarr[j][i]=all.nextInt();
			  }
		  }
		  //close every files
		  all.close();
		  return allarr;
	}
	//interface for Available file
	public static int[] ava(Scanner key) throws FileNotFoundException, IOException{
		System.out.println("Please enter the Available fil name or enter \"q\" to leave.");
		String input=key.nextLine();
		if(input.equalsIgnoreCase("q")) {
			System.exit(0);
		}
		String file = input;
		File obj = new File(file);
		Scanner all = new Scanner(obj);
		int n=all.nextInt();
		int[] ava= new int[n];
		for(int i=0;i < n;i++) {
			ava[i]=all.nextInt();
		}
		//close every files
		all.close();
		key.close();
		return ava;
	}
}
