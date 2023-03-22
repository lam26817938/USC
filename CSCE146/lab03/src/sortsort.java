/*
 * Written by Lian Liao
 */
import java.util.Scanner;
public class sortsort {
	public static final int SIZE = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		sortcounter[] sorts = new sortcounter[SIZE];
		System.out.println("Enter any number of strings and I will sort by SORT¡¦s.  Once you¡¦re done entering sentences enter ¡§quit¡¨.");
		String input = "";
		int count = 0;
		while(count < SIZE) {
			input = keyboard.nextLine();
			if(input.equalsIgnoreCase("quit"))
				break;
			sorts[count] = new sortcounter(input);
			count++;
		}
		mergesort(sorts);
		System.out.println("sort SORTED!");
		for(sortcounter s : sorts) {
			if(s == null)
				break;
			System.out.println(s.getstr());
		}
	}
	public static void mergesort(sortcounter[] sortarr) {
		int size = sortarr.length;
		if(size<2)
			return;
		int mid = size/2;
		int leftsize = mid;
		int rightsize = size - mid;
		sortcounter[] left = new sortcounter[leftsize];
		sortcounter[] right = new sortcounter[rightsize];
		for(int i=0;i<mid;i++)
			left[i] = sortarr[i];
		for(int i=mid;i<size;i++)
			right[i-mid] = sortarr[i];
		mergesort(left);
		mergesort(right);
		merge(left,right,sortarr);
	}
	public static void merge(sortcounter[] left, sortcounter[] right, sortcounter[] a) {
		int leftsize = left.length;
		int rightsize = right.length;
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<leftsize && j<rightsize) {
			if(left[i] == null || right[j] == null)
				break;
			if(left[i].getnumofsort() <= right[j].getnumofsort()) {
				a[k] = left[i];
				i++;
				k++;
			}
			else {
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while(i<leftsize) {
			a[k] = left[i];
			i++;
			k++;
		}
		while(j<rightsize) {
			a[k] = right[j];
			j++;
			k++;
		}
	}
}
