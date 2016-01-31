package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuxiaofei on 2016/1/31.
 */
public class Q219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> record = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            Integer pre = record.get(nums[i]);
            if (pre != null) {
                if (i - pre <= k)
                    return true;
            }
            record.put(nums[i], i);
        }
        return false;
    }
}
