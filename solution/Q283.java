package solution;

public class Q283 {
	/*
	 * this got Wrong Answer, because disturbing it`s origin order
	 */
	// public void moveZeroes(int[] nums) {
	// if (nums.length == 0) {
	// return;
	// }
	// int start = 0, end = nums.length - 1;
	// while (start < end) {
	// if (nums[start] != 0) {
	// start++;
	// continue;
	// } else {
	// nums[start] = nums[end];
	// nums[end] = 0;
	// start++;
	// end--;
	// }
	// }
	// }

	/*********************************************************/
	/*
	 * This method just like bulb sort, but it`s cost too long time.The complex
	 * is O(n*n)
	 */
	// public void moveZeroes(int[] nums) {
	// if (nums.length == 0) {
	// return;
	// }
	// for (int i = nums.length - 1; i >= 0; i--) {
	// for (int j = 0; j < i; j++) {
	// if (nums[j] == 0) {
	// nums[j] = nums[j + 1];
	// nums[j + 1] = 0;
	// }
	// }
	// }
	// }
	public void moveZeroes(int[] nums) {
		int pointer = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[pointer++] = nums[i];
			}
		}
		for (; pointer < nums.length; pointer++) {
			nums[pointer] = 0;
		}
	}
}
