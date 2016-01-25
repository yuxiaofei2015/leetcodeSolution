package solution;

/**
 * Created by yuxiaofei on 2016/1/25.
 */
public class Q198 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        if (nums.length == 3) {
            return Math.max(nums[0] + nums[2], nums[1]);
        }
        int[] record = new int[nums.length];
        record[0] = nums[0];
        record[1] = nums[1];
        record[2] = nums[2] + nums[0];
        for (int i = 3; i < nums.length; i++) {
            record[i] = Math.max(record[i - 2], record[i - 3]) + nums[i];
        }
        return Math.max(record[nums.length - 1], record[nums.length - 2]);
    }
}
