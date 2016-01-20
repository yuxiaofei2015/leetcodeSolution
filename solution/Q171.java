package solution;

public class Q171 {
	public int titleToNumber(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int t = s.charAt(i) - 'A' + 1;
			result = result * 26 + t;
		}
		return result;
	}
}
