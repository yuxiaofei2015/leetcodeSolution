package solution;
import reference.TreeNode;

public class Q100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q != null) {
			return false;
		}
		if (p != null && q == null) {
			return false;
		}
		if (p == null && q == null) {
			return true;
		}
		if (p.val == q.val) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		} else {
			return false;
		}
	}
}
