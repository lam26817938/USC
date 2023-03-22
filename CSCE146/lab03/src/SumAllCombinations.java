/*
 * Written by Lian Liao
 */
import java.util.*;
public class SumAllCombinations {

	public static final int size = 5;
	public static final int range = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the sum of all combination program!");
		int[] a = new int[size];
		randarray(a);
		sumandprintcomb(a);
	}
	public static void randarray(int[] a) {
		Random r = new Random();
		System.out.print("Given array = {");
		for(int i=0;i<a.length;i++) {
			a[i] = r.nextInt(range);
			System.out.print(a[i]+" ");
		}
		System.out.println("}, all summed combinations are: ");
	}
	public static void sumandprintcomb(int[] a) {
		sumandprintcomb(a, new int[1],0,1);
	}
	public static void sumandprintcomb(int[] a, int[] workingarray, int currI, int currD) {
		if(currI >= a.length || currD > a.length)
			return;
		int[] c = new int[currD];
		for(int i=0;i<workingarray.length;i++)
			c[i] = workingarray[i];
		c[c.length-1] = a[currI];
		print(c);
		sumandprintcomb(a,c,currI+1,currD+1);
		sumandprintcomb(a,c,currI+1,currD);
	}
	public static void print(int[] a) {
		System.out.print(a[0]);
		for(int i=1;i<a.length;i++)
			System.out.print(" + "+a[i]);
		System.out.println(" = "+sum(a));
	}
	public static int sum(int[] a) {
		int ret = 0;
		for(int i=0;i<a.length;i++)
			ret += a[i];
		return ret;
	}
}
