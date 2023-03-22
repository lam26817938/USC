/*
 * Written by Lian Liao
 */
public class Jelly {
	private String fruittype;
	private int calories;
	private String name;
	
	public Jelly(String n, int c, String t) {
		this.setfruittype(t);
		this.setcalories(c);
		this.setname(n);
	}
	public String gettype() {
		return this.fruittype;
	}
	public double getcalories() {
		return this.calories;
	}
	public String getname() {
		return this.name;
	}
	public void setfruittype(String T) {
		if(T != null && T.equalsIgnoreCase("Apple")||T.equalsIgnoreCase("Blueberry")||T.equalsIgnoreCase("Grape")||T.equalsIgnoreCase("Strawberry")||T.equalsIgnoreCase("Tomato"))
				this.fruittype = T;
	}
	public void setcalories(int W) {
		if(W >= 50 && W <= 200)
			this.calories = W;
	}
	public void setname(String s) {
		this.name= s ;
	}
	public String toString() {
		return "Jelly\nName: " + this.name + "\nCalories: " + this.calories + "\nFruit Type: " + this.fruittype + "\n";
	}
	public boolean equals(Jelly A) {
		return A != null && this.fruittype.equalsIgnoreCase(A.gettype()) && this.calories == A.calories && this.name.equalsIgnoreCase(A.getname());
	}
}
