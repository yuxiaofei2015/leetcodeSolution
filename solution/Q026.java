package solution;

/**
 * Created by yuxiaofei on 2016/1/26.
 */
public class Q026 {
    public int removeDuplicates(int[] nums) {
        int cur = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[cur]) {
                nums[++cur] = nums[i];
            }
        }
        return cur+1;
    }
}
