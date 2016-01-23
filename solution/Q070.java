package solution;

public class Q070 {
	public int climbStairs(int n) {
		if (n == 0 || n == 1 || n == 2) {
			return n;
		}
		int[] record = new int[n + 1];
		record[0] = 0;
		record[1] = 1;
		record[2] = 2;
		for (int i = 3; i <= n; i++) {
			record[i] = record[i - 1] + record[i - 2];
		}
		return record[n];
	}
}
