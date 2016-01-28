package solution;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yuxiaofei on 2016/1/28.
 */
public class Q225 {
    Queue<Integer> main = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        main.add(x);
        for (int i = 0; i < main.size() - 1; i++) {
            main.add(main.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        main.poll();
    }

    // Get the top element.
    public int top() {
       return main.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return main.isEmpty();
    }
}
