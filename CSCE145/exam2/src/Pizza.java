/*
 * CSCE 145 S2021 Exam02 Question04
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 */
//Do not alter-----------------------------------------------------------------------
public class Pizza {
	private String location;
	
	public Pizza()
	{
		location = "none";
	}
	public Pizza(String aL)
	{
		if(aL != null)
			location = aL;
		else
			location = "none";
	}
	public String getLocation() {
		return location;
	}
	public boolean equals(Pizza aP)
	{
		return aP != null && this.location.equals(aP.getLocation());
	}
}
//-----------------------------------------------------------------------------------
