package solution;

public class Q027 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (nums[end] == val) {
                end--;
                continue;
            }
            if (nums[start] == val) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            } else {
                start++;
            }
        }
        return start;
    }

    public int removeElement1(int[] nums, int val) {
        int end = nums.length - 1;
        for (int start = 0; start <= end; start++) {
            while (nums[end] == val) {
                end--;
                if (end < 0) {
                    return 0;
                }
            }
            if (nums[start] == val && start < end) {
                nums[start] = nums[end];
                end--;
            }
        }
        return end + 1;
    }
}
