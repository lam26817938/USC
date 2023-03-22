/*
 * Written by Lian Liao
 */
public class PineapplePizza extends Pizza{
	private double Pineapple;
	public PineapplePizza() {
		super();
		this.Pineapple = 0.25;
	}
	public PineapplePizza(String a, double b) {
		super(a);
		setPineapple(b);
	}
	public double getPineappleAmount() {
		return this.Pineapple;
	}
	public void setPineapple(double T) {
		if(T > 0)
			this.Pineapple = T;
	}
	public boolean equals(PineapplePizza A) {
		return A != null && this.Pineapple ==  A.getPineappleAmount() && super.equals(A);
	}
}

/* Solution Description
I created the PineapplePizza and extend Pizza in order to inherit Pizza class, Then I can use ¡¨super¡¨ 
like pizza. Used private to made instance Pineapple as double. Created the first constructor to give
the default value. Location in Pizza already has constructor and accessor, so I just need to use super(),
after it set the Pineapple=0.25. Second constructor calls the pizza with super(a) and gives it the first
value, then setPineapple in mutator. Next step, created the accessor and mutator. In mutator, just
make sure that Pineapple among is greater than 0. Last method, equals, return that the different
Pineapple() is equal or not with super.equals(A) to access Pizza¡¦s equals method. Finally, I
only got one error in the test. ¡§Checking the equals method with 2 pizzas with different values¡¨
I got true because I didn¡¦t compare location. That means I didn¡¦t add super.equals(A) because I
thought I just check pineapplePizza.
*/