package solution;

import java.util.Stack;

/**
 * Created by yuxiaofei on 2016/2/1.
 */
public class Q020 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            if (c == ')') {
                if (stack.pop() == '(') continue;
                else return false;
            }
            if (c == ']') {
                if (stack.pop() == '[') continue;
                else return false;
            }
            if (c == '}') {
                if (stack.pop() == '{') continue;
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
