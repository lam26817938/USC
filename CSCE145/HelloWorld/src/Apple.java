/*
 * Written by Lian Liao
 */
public class Apple {
	private String type;
	private double weight;
	private double price;
	
	public Apple() {
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}
	public Apple(String T, double W, double P) {
		this.setType(T);
		this.setWeight(W);
		this.setPrice(P);
	}
	public String getType() {
		return this.type;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getPrice() {
		return this.price;
	}
	public void setType(String T) {
		if(T != null && T.equalsIgnoreCase("gala")||T.equalsIgnoreCase("Red Delicious")||T.equalsIgnoreCase("Golden Delicious")||T.equalsIgnoreCase("Granny Smith"))
				this.type = T;
		else
			this.type = "Gala";
	}
	public void setWeight(double W) {
		if(W >= 0 && W <= 2)
			this.weight = W;
		else
			this.weight = 0;
	}
	public void setPrice(double P) {
		if(P >= 0)
			this.price = P;
	}
	public String toString() {
		return "Type: " + this.type + " Weight: " + this.weight + " Price: " + this.price;
	}
	public boolean equals(Apple A) {
		return A != null && this.type.equals(A.getType()) && this.weight == A.getWeight() && this.price == A.getPrice();
	}
}
