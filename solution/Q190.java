package solution;

/**
 * Created by yuxiaofei on 2016/1/29.
 */
public class Q190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                result |= 1 << (31 - i);
            }
        }
        return result;
    }
}
