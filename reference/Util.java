package reference;

public class Util {
	public static void printArray(int[] nums) {
		System.out.print("[");
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				System.out.print(nums[i]);
			} else {
				System.out.print(", " + nums[i]);
			}
		}
		System.out.println("]");
	}
}
