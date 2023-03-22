/*
 * Written by Lian Liao
 */
public class Coffee {
	private String Name;
	private double Caffeine;
	public Coffee(String N, double C) {
		this.getname(N);
		this.getcaffeine(C);
	}
	public void getname(String N) {
		this.Name = N;
	}
	public void getcaffeine(double C) {
		if(C >= 50 && C <=300)
			this.Caffeine=180/((C/100)*6);
	}
	public String toString() {
		return "It would take " + this.Caffeine + " " + this.Name + " coffees to before it¡¦s dangerous to drink more.";
	}
}
