package solution;

/**
 * Created by yuxiaofei on 2016/1/27.
 */
public class Q172 {
    //这道题的本质就是计算n阶乘中5的倍数的个数。
    public int trailingZeroes(int n) {
        int count = 0;
        while(n!=0){
            n/=5;
            count+=n;
        }
        return count;
    }
}
