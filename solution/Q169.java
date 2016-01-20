package solution;

public class Q169 {
	/* 第一次的思路：用hashMap保存结果 。时间上明显超出大部分结果 */
	// public int majorityElement(int[] nums) {
	// if (nums == null) {
	// return 0;
	// }
	// Map<Integer, Integer> hashTable = new HashMap<Integer, Integer>();
	// for (int i : nums) {
	// if (hashTable.get(i) == null) {
	// hashTable.put(i, 1);
	// } else {
	// int t = hashTable.get(i);
	// hashTable.put(i, t + 1);
	// }
	// }
	// Set<Integer> keySet = hashTable.keySet();
	// for (Iterator<Integer> it = keySet.iterator(); it.hasNext();) {
	// int i = it.next();
	// int count = hashTable.get(i);
	// if (count > nums.length / 2) {
	// return i;
	// }
	// }
	// return 0;
	// }

	/* 这是参考了discuss中的做法 */
	// public int majorityElement(int[] nums) {
	// if (nums == null || nums.length == 0) {
	// return 0;
	// }
	// int major = nums[0];
	// int count = 0;
	// for (int i : nums) {
	// if (count == 0) {
	// major = i;
	// count++;
	// } else {
	// if (major == i) {
	// count++;
	// } else {
	// count--;
	// }
	// }
	// }
	// return major;
	// }
	/* 最后，用位操作处理一遍 */
	public int majorityElement(int[] nums) {
		int[] map = new int[32];
		for (int i : nums) {
			for (int k = 0; k < 32; k++) {
				if ((i & 1) == 1) {
					map[k]++;
				}
				i >>= 1;
			}
		}
		// System.out.println(Integer.toBinaryString(-2147483648));
		// Util.printArray(map);
		int result = 0;
		for (int k = 31; k >= 0; k--) {
			result = result << 1;
			if (map[k] > nums.length / 2) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new Q169()
				.majorityElement(new int[] { -2147483648 }));
	}
}
