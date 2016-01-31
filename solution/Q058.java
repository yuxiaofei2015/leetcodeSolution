package solution;

/**
 * Created by yuxiaofei on 2016/1/31.
 */
public class Q058 {
    public static void main(String[] args) {
        System.out.println(new Q058().lengthOfLastWord(" " +
                " "));
    }

    public int lengthOfLastWord(String s) {
        int end = s.length();
        while (end > 0) {
            if (s.charAt(end-1) != ' ') break;
            end--;
        }
        int start = end;
        while (start > 0) {
            if (s.charAt(start-1) == ' ') break;
            start--;
        }
        return end - start;
    }
}
