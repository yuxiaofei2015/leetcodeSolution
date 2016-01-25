package solution;

public class Q013 {
	int[][] map = { { 'I', 1 }, { 'V', 5 }, { 'X', 10 }, { 'L', 50 },
			{ 'C', 100 }, { 'D', 500 }, { 'M', 1000 } };

	public int romanToInt(String s) {
		if (s.length() == 0) {
			return 0;
		}

		int result = 0;
		int i = 0;
		while (true) {
			int temp = getValue(s.charAt(i));
			if (i + 1 == s.length()) {
				result += temp;
				break;
			}
			int after = getValue(s.charAt(i + 1));
			if (after > temp) {
				result -= temp;
			} else {
				result += temp;
			}
			i++;
		}
		return result;
	}

	public int getValue(char c) {
		for (int i = 0; i < map.length; i++) {
			if (c == map[i][0]) {
				return map[i][1];
			}
		}
		return 0;
	}
}
