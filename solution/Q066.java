package solution;

/**
 * Created by yuxiaofei on 2016/1/26.
 */
public class Q066 {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return digits;
        }
        int cur = digits.length - 1;
        digits[cur]++;
        while (digits[cur] > 9 && cur >= 1) {
            digits[cur] = 0;
            digits[--cur]++;
        }
        if (digits[0] > 9) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            digits[0] = 0;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        } else {
            return digits;
        }
    }

    //    I see another good solution on disscuss
    public int[] plusOne1(int[] digits) {
        if (digits.length == 0) {
            return digits;
        }
        int index = digits.length - 1;
        while (digits[index] == 9 && index > 0) {
            digits[index] = 0;
            index--;
        }
        if (digits[index] == 9) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            digits[index]++;
            return digits;
        }
    }
}
