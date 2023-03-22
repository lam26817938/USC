/*
 * Written by Lian Liao
 */
public class StringHelper {
	public static boolean hasAllUniqueCharacters(String s) {
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j))
					return false;
			}
		}
		return true;
	}
	public static String meshStrings(String s1, String s2) {
		if(s1 == null || s2 == null)
			return null;
		String big, small;
		if(s1.length()>s2.length()) {
			big = s1;
			small = s2;
		}else {
			big = s2;
			small = s1;	
		}
			String re="";
			for(int i=0;i<small.length();i++) {
				re = re + (s1.charAt(i) + "" + s2.charAt(i));
			}
			re = re + big.substring(small.length());
			return re;
	}
	public static String replaceVowelsWithOodle(String s) {
		String re = "";
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				re= re+"oodle";
			else 
				re = re + s.substring(i,i+1);
		}
		return re;
			
	}
	public static double weight(String s) {
		double re = 0;
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u')
				re = re + 2.5;
			else
				re = re + 3.4;
		}
		return re;
	}
}
