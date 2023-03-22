/*
 * CSCE 145 S2021 Exam02 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
public class Box 
{
	private String label;
	private double weight;
	public Box(String aL, double aW)
	{
		if(aL != null)
			this.label = aL;
		if(aW > 0.0)
			this.weight = aW;
	}
	public String getLabel() {
		return label;
	}
	public double getWeight() {
		return weight;
	}
	public String getString()
	{
		return "[Box] Label: "+this.label+" Weight: "+this.weight;
	}
}
//-----------------------------------------------------------------------------------