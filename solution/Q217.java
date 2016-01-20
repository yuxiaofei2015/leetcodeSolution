package solution;

public class Q217 {
	public static void main(String[] args) {
		int[] nums = { 0, 4, 5, 0, 3, 6 };
		new Q217().containsDuplicate(nums);
	}

	/* 经典的hash实现 */
	public boolean containsDuplicate(int[] nums) {
		if (nums == null) {
			return false;
		}
		int[] hashTable = new int[nums.length];
		for (int i = 0; i < hashTable.length; i++) {
			hashTable[i] = Integer.MIN_VALUE;
		}
		for (int i = 0; i < nums.length; i++) {
			int h = nums[i] % nums.length;
			h = h >= 0 ? h : h + nums.length;
			// System.out.println("origin_h:%d" + h);
			// Util.printArray(hashTable);
			while (hashTable[h] != Integer.MIN_VALUE) {
				if (nums[i] == hashTable[h]) {
					return true;
				} else {
					h = (h + 1) % nums.length;
				}
			}
			// System.out.println("final_h: " + h);
			hashTable[h] = nums[i];
		}
		return false;
	}
}
