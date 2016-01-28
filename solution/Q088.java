package solution;

/**
 * Created by yuxiaofei on 2016/1/28.
 */
public class Q088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cur = m + n - 1;
        int i1 = m - 1;
        int i2 = n - 1;
        while (cur >= 0) {
            if (i1 < 0) {
                nums1[cur--] = nums2[i2--];
                continue;
            }
            if (i2 < 0) {
                break;
            }
            if (nums1[i1] < nums2[i2]) {
                nums1[cur--] = nums2[i2--];
            } else {
                nums1[cur--] = nums1[i1--];
            }

        }
    }
}
