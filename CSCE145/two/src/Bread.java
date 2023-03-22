/*
 * Written by Lian Liao
 */
public class Bread {
	private String type;
	private int calories;
	private String name;
	
	public Bread(String n, int c, String t) {
		this.settype(t);
		this.setcalories(c);
		this.setname(n);
	}
	public String gettype() {
		return this.type;
	}
	public int getcalories() {
		return this.calories;
	}
	public String getname() {
		return this.name;
	}
	public void settype(String T) {
		if(T != null && T.equalsIgnoreCase("Honey Wheat")||T.equalsIgnoreCase("White")||T.equalsIgnoreCase("Whole Grain")||T.equalsIgnoreCase("Whole Wheat"))
				this.type = T;
	}
	public void setcalories(int W) {
		if(W >= 50 && W <= 250)
			this.calories = W;
	}
	public void setname(String s) {
		this.name= s ;
	}
	public String toString() {
		return "Bread\nName: " + this.name + "\nCalories: " + this.calories + "\nType: " + this.type + "\n";
	}
	public boolean equals(Bread A) {
		return A != null && this.type.equalsIgnoreCase(A.gettype()) && this.calories == A.calories && this.name.equalsIgnoreCase(A.getname());
	}
}
