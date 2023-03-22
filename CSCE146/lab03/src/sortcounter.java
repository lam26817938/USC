/*
 * Written by Lian Liao
 */
public class sortcounter {
	private int numofsorts;
	private String str;
	public sortcounter(String astr) {
		this.str = astr;
		this.numofsorts = 0;
		this.countsorts(astr);
	}
	public int getnumofsort() {
		return this.numofsorts;
	}
	public String getstr() {
		return this.str;
	}
	public void countsorts(String astr) {
		if(astr == null)
			return;
		astr = astr.toUpperCase();
		for(int i=0;i<astr.length()-3;i++) {
			if(astr.charAt(i) == 'S' && astr.charAt(i+1) == 'O'&& astr.charAt(i+2) == 'R'&& astr.charAt(i+3) == 'T')
				this.numofsorts++;
		}
	}
}
