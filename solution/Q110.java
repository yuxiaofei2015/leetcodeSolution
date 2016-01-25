package solution;

import reference.TreeNode;

public class Q110 {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (calculateDepth(root) > 0) {
			return true;
		} else {
			return false;
		}
	}

	public int calculateDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = calculateDepth(root.left);
		int right = calculateDepth(root.right);
		if (left == -1 || right == -1 || Math.abs(left - right) > 1)
			return -1;
		return Math.max(left, right) + 1;
	}
}
