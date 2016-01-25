package solution;

import java.util.Stack;

public class Q232 {
	Stack<Integer> mainStack = new Stack();
	Stack<Integer> assistStack = new Stack();

	// Push element x to the back of queue.
	public void push(int x) {
		mainStack.add(x);
	}

	// Removes the element from in front of queue.
	public void pop() {
		if (mainStack.size() == 1) {
			mainStack.pop();
		} else {
			while (mainStack.size() > 1) {
				assistStack.add(mainStack.pop());
			}
			mainStack.pop();
			while (!assistStack.isEmpty()) {
				mainStack.add(assistStack.pop());
			}
		}
	}

	// Get the front element.
	public int peek() {
		return mainStack.get(0);
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return mainStack.isEmpty();
	}
}
