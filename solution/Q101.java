package solution;

import java.util.LinkedList;
import java.util.Queue;

import reference.TreeNode;

public class Q101 {
	/* recursive */
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isMirror(root.left, root.right);
	}

	public boolean isMirror(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left == null || right == null) {
			return false;
		}
		if (left.val != right.val) {
			return false;
		}
		return isMirror(left.left, right.right)
				&& isMirror(left.right, right.left);
	}

	/* iterative */
	public boolean isSymmetricIterative(TreeNode root) {
		if (root == null) {
			return true;
		}
		Queue<TreeNode> left = new LinkedList<>();
		Queue<TreeNode> right = new LinkedList<>();
		left.add(root.left);
		right.add(root.right);
		while (!left.isEmpty() && !right.isEmpty()) {
			int leftSize = left.size(), rightSize = right.size();
			if (leftSize != rightSize) {
				return false;
			}
			for (int i = 0; i < leftSize; i++) {
				TreeNode leftNode = left.remove();
				TreeNode rightNode = right.remove();
				if (leftNode == null && rightNode == null) {
					continue;
				}
				if (leftNode == null || rightNode == null) {
					return false;
				}
				if (leftNode.val != rightNode.val) {
					return false;
				} else {
					left.add(leftNode.left);
					left.add(leftNode.right);
					right.add(rightNode.right);
					right.add(rightNode.left);
				}
			}
		}
		return left.isEmpty() && right.isEmpty();
	}
}
