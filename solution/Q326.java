package solution;

public class Q326 {
	/* ´ò±í */
	// public static void main(String[] args) {
	// int temp = 1;
	// StringBuilder sb = new StringBuilder();
	// sb.append("{1");
	// for (int i = 0; temp < Integer.MAX_VALUE && temp * 3 > 0; i++) {
	// temp *= 3;
	// sb.append(", ");
	// sb.append(temp);
	// }
	// sb.append("}");
	// System.out.println(sb.toString());
	// }

	public boolean isPowerOfThree(int n) {
		if (n <= 0) {
			return false;
		}
		double excise = 1e-10;
		double log = Math.log(n) / Math.log(3);
		return Math.abs(log - Math.rint(log)) < excise;
	}

	public boolean isPowerOfThree1(int n) {
		if (n <= 0) {
			return false;
		}
		int[] table = { 1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049,
				177147, 531441, 1594323, 4782969, 14348907, 43046721,
				129140163, 387420489, 1162261467 };
		for (int i = 0; i < table.length; i++) {
			if (table[i] == n) {
				return true;
			}
		}
		return false;
	}

	public boolean isPowerOfThree2(int n) {
		return n <= 0 ? false : 1162261467 % n == 0;

	}
}
