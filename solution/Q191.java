package solution;

public class Q191 {
	public static void main(String[] args) {
		System.out.println(new Q191().hammingWeight(Integer.MIN_VALUE));

	}

	public int hammingWeight(int n) {
		int result = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & (1 << i)) != 0) {
				result++;
			}
		}
		return result;
	}
}
