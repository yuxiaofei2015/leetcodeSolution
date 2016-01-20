package solution;

public class Q242 {
	// 思路：用一个字符的映射计数
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] map = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map[c]++;
		}
		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			map[c]--;
		}
		for (int i = 0; i < map.length; i++) {
			if (map[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
