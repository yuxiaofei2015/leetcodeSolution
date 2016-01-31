package solution;

/**
 * Created by yuxiaofei on 2016/1/30.
 */
public class Q223 {
    public static void main(String[] args) {
        new Q223().computeArea1(
                -2,
                -2,
                2,
                2,
                -2, -2,
                2,
                2
        );
    }

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int W1 = C - A, H1 = D - B, W2 = G - E, H2 = H - F;
        int totalArea = W1 * H1 + W2 * H2;
        int coverW = 0, coverH = 0;
        if (E >= A && E <= C && G >= C) {
            coverW = C - E;
        } else if (E >= A && G <= C) {
            coverW = G - E;
        } else if (G >= A && G <= C && E <= A) {
            coverW = G - A;
        } else if (E <= A && G >= C) {
            coverW = C - A;
        }
        if (H >= D && F <= D && F >= B) {
            coverH = D - F;
        } else if (H <= D && H >= B && B >= F) {
            coverH = H - B;
        } else if (F >= B && H <= D) {
            coverH = H - F;
        } else if (H >= D && F <= B) {
            coverH = D - B;
        }
        System.out.println(String.format("totalArea:%d,coverW:%d,coverH:%d", totalArea, coverW, coverH));
        return totalArea - coverH * coverW;
    }

    public int computeArea1(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A, E);
        int right = Math.max(Math.min(C, G), left);
        int bottom = Math.max(B, F);
        int top = Math.max(Math.min(D, H), bottom);
        System.out.println(String.format("left:%d,right:%d,bottom:%d,top:%d", left, right, bottom, top));
        return (C - A) * (D - B) + (G - E) * (H - F) - (right - left) * (top - bottom);
    }
}
