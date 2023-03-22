/*
 * Written by Lian Liao
 */
public class PBJSandwich {
	private String topslive;
	private String PeanutButter;
	private String Jelly;
	private String BottomSlice;
	
	public PBJSandwich(String b1, int b2, String b3,String p1, int p2, String p3,String j1, int j2, String j3,String b4, int b5, String b6) {
		this.settopslive(b1,b2,b3);
		this.setPeanutButter(p1,p2,p3);
		this.setJelly(j1,j2,j3);
		this.setBottomSlice(b4,b5,b6);
	}
	public String gettopslive() {
		return this.topslive;
	}
	public String getPeanutButter() {
		return this.PeanutButter;
	}
	public String getJelly() {
		return this.Jelly;
	}
	public String getBottomSlice() {
		return this.BottomSlice;
	}
	public void settopslive(String b1, int b2, String b3) {
		Bread b = new Bread(b1,b2,b3);
		this.topslive = "Top Slice:\n" + b;
	}
	public void setPeanutButter(String p1, int p2, String p3) {
		PeanutButter p = new PeanutButter(p1,p2,p3);
		this.PeanutButter = "Peanut Butter:\n" + p;
	}
	public void setJelly(String j1, int j2, String j3) {
		Jelly j = new Jelly(j1,j2,j3);
		this.Jelly = "Jelly:\n" + j;
	}
	public void setBottomSlice(String b1, int b2, String b3) {
		Bread bb = new Bread(b1,b2,b3);
		this.BottomSlice = "Bottom Slice:\n" + bb;
	}
	public String toString() {
		return "PBJ Sandwich\n" + this.topslive + this.PeanutButter + this.Jelly + this.BottomSlice;
	}
	public boolean equals(PBJSandwich A) {
		return A != null && this.topslive.equalsIgnoreCase(A.gettopslive()) && this.BottomSlice.equalsIgnoreCase(A.getBottomSlice()) && this.Jelly.equalsIgnoreCase(A.getJelly())&&this.PeanutButter.equalsIgnoreCase(A.getPeanutButter());
	}
}
