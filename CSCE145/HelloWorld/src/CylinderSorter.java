/*
 * Written by Lian Liao
 */
import java.util.Scanner;
public class CylinderSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		boolean all = true;
		while(all) {			
			System.out.println("Welcome to the Cylinder Sorter!");
			System.out.println("How many cylinders are we creating?");
			int num = keyboard.nextInt();
			while(true) {
				if(isValid(num))
					break;
				else 		
					num = keyboard.nextInt();				
			}
			
			String[] name = new String[num];
			double[] radius = new double[num];
			double[] height = new double[num];
			for(int i = 0;i < num;i++) {
				System.out.println("Enter the name for Cylinder " + i);
				name[i] = keyboard.next();
				System.out.println("Enter the radius for Cylinder " + i);
				radius[i] = keyboard.nextDouble();
				while(true) {
					if(isValid(radius[i]))
						break;
					else 		
						radius[i] = keyboard.nextDouble();				
				}
				System.out.println("Enter the height for Cylinder " + i);
				height[i] = keyboard.nextDouble();
				while(true) {
					if(isValid(height[i]))
						break;
					else 		
						height[i] = keyboard.nextDouble();				
				}
			}
			while(true) {
				System.out.println("Choose from the following:\n1. Sort Cylinders by Radius\n2. Sort Cylinders by Height\n3. Sort Cylinders by Volume\r\n"
					+ "9. Reenter Cylinder Data\n0. To Quit");
				int ans = keyboard.nextInt();
				if(ans == 1) {
					System.out.println("Sorted Cylinders");
					int[] ind = compare(radius);
					for(int i=0;i<radius.length;i++) {
						System.out.println("Cylinder "+ name[ind[i]] + " Radius: " + radius[ind[i]] + " Height: " + height[ind[i]] + " Volume: " + (Math.PI*Math.pow(radius[ind[i]], 2)*height[ind[i]]));
					}
				}
				if(ans == 2) {
					System.out.println("Sorted Cylinders");
					int[] ind = compare(height);
					for(int i=0;i<height.length;i++) {
						System.out.println("Cylinder "+ name[ind[i]] + " Radius: " + radius[ind[i]] + " Height: " + height[ind[i]] + " Volume: " + (Math.PI*Math.pow(radius[ind[i]], 2)*height[ind[i]]));
					}
				}
				if(ans == 3) {
					System.out.println("Sorted Cylinders");
					int[] ind = compare2(radius, height);
					for(int i=0;i<height.length;i++) {
						System.out.println("Cylinder "+ name[ind[i]] + " Radius: " + radius[ind[i]] + " Height: " + height[ind[i]] + " Volume: " + (Math.PI*Math.pow(radius[ind[i]], 2)*height[ind[i]]));
					}
				}
				if(ans == 9)
					break;
				if(ans == 0) {
					all = false;
					break;
				}		
			}
		}
		System.out.println("Goodbye");
	}
	public static boolean isValid(double num) {
		if(num>0)
			return true;
		else {
			System.out.println("That is not a valid value. Try a value greater than 0.");
			return false;
		}				
	}
	public static int[] compare(double[] copy) {
		int[] ind = new int[copy.length];
		double[] arr = new double[copy.length];
		for(int i=0;i<arr.length;i++) {
			ind[i] = i;
			arr[i] = copy[i];
		}	
		for(int j=0;j<arr.length-1;j++) {
			for(int i=0;i<arr.length-1;i++) {
				double temp = arr[i];
				int tem = ind[i];
				if(temp>arr[i+1]) {
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					ind[i] = ind[i+1];
					ind[i+1] = tem;
				}
			}
		}
		return ind;
	}
	public static int[] compare2(double[] rr, double[] hh) {
		int[] ind = new int[rr.length];
		double[] v = new double[rr.length];
		double[] r = new double[rr.length];
		double[] h = new double[rr.length];
		for(int i=0;i<r.length;i++){
			ind[i] = i;
			r[i] = rr[i];
			h[i] = hh[i];
			v[i]= Math.pow(r[i], 2)*h[i];
		}
		for(int j=0;j<r.length-1;j++) {
			for(int i=0;i<r.length-1;i++) {
				double temp = v[i];
				int tem = ind[i];
				if(temp>v[i+1]) {
					v[i] = v[i+1];
					v[i+1] = temp;
					ind[i] = ind[i+1];
					ind[i+1] = tem;
				}
			}
		}
		return ind;
	}
}
