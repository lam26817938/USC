/*
 * Written by Lian Liao
 */
public class Sandwich {
	public static double PRICE_PER_EXTRA = 0.99;
	private String Name;
	private double BasePrice;
	private int Extras ;
	public Sandwich() {
		this.Name = "none";
		this.BasePrice = 1.0;
		this.Extras = 0;
	}
	public Sandwich(String T, double W, int P) {
		this.setName(T);
		this.setBasePrice(W);
		this.setExtras(P);
	}
	public String getName() {
		return this.Name;
	}
	public double getBasePrice() {
		return this.BasePrice;
	}
	public int getExtras() {
		return this.Extras;
	}
	public void setName(String T) {
		if(T == null)
			this.Name = "null";
		else
			this.Name = T;
	}
	public void setBasePrice(double W) {
		if(W >= 0 )
			this.BasePrice = W;
		else
			this.BasePrice = 1;
	}
	public void setExtras(int P) {
		if(P >= 0)
			this.Extras = P;
		else
			this.Extras = 0;
	}
	public boolean equals(Sandwich A) {
		return A != null && this.Name.equals(A.getName()) && this.BasePrice == A.getBasePrice() && this.Extras == A.getExtras();
	}
	public double getTotalPrice() {
		return this.BasePrice + (this.Extras*PRICE_PER_EXTRA);
	}
	public String toString() {
		return "Name: " + this.Name + " Base Price: " + this.BasePrice + " Total Price: " + getTotalPrice();
	}
	public static Sandwich mostExpensive(Sandwich a, Sandwich b) {
		if(a == null && b == null)
			return null;
		else if(a == null)
			return b;
		else if(b == null)
			return a;
		else if(a.getTotalPrice() >= b.getTotalPrice())
			return a;
		else
			return b;
	}
}

/* Solution Description
 * 	I created the Sandwich, Question1 and 2 class first. Class constant Price_Per_Extra set as public static double.
 *  Use private to made three instances that their types are string, double, and int. Next, created first constructor
 *  to set the default values to them. The second one gets three parameter and check their value in mutators. Therefore,
 *  create the accessors and mutators. In setName, check the value of name if it is null. In setBasePrice,
 *  check the value of price is bigger than 0, same to setExtras. Equals method is Boolean, check the values are
 *  same to accessors ¡¥s. In getTotalPrice method, return baseprice+(extra*0.99=constant). In toString method,
 *  change the output to String and set it to the format. The last method, mostExpensive, I used if-else to
 *  determine every possible input if they are null, then compare them. I tested it and got no syntax error,
 *  but some values are incorrect like I accidentally set Extra in double type. Finally, I tested Question2 and got no error!
 */ 
