/*
 * Written by Lian Liao
 */
public class PeanutButter {
	private String iscrunchy;
	private int calories;
	private String name;
	
	public PeanutButter(String n, int c, String t) {
		this.settype(t);
		this.setcalories(c);
		this.setname(n);
	}
	public String getiscrunchy() {
		return this.iscrunchy;
	}
	public double getcalories() {
		return this.calories;
	}
	public String getname() {
		return this.name;
	}
	public void settype(String T) {
		if(T.equalsIgnoreCase("true"))
			this.iscrunchy = "true";
		else if(T.equalsIgnoreCase("false"))
			this.iscrunchy = "false";
	}
	public void setcalories(int W) {
		if(W >= 100 && W <= 300)
			this.calories = W;
	}
	public void setname(String s) {
		this.name= s ;
	}
	public String toString() {
		return "Peanut Butter\nName: " + this.name + "\nCalories: " + this.calories + "\nIs Crunchy: " + this.iscrunchy + "\n";
	}
	public boolean equals(PeanutButter A) {
		return A != null && this.iscrunchy.equalsIgnoreCase(A.getiscrunchy()) && this.calories == A.calories && this.name.equalsIgnoreCase(A.getname());
	}
}
