package solution;

import reference.TreeNode;

/**
 * Created by yuxiaofei on 2016/1/28.
 */
public class Q112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return sum == 0;
        } else {
            return hasPath(root, 0, sum);
        }
    }

    private boolean hasPath(TreeNode root, int pre, int sum) {
        int cur = pre + root.val;
        if (cur == sum && root.left == null && root.right == null) return true;
        boolean left = false;
        boolean right = false;
        if (root.left != null) {
            left = hasPath(root.left, cur, sum);
        }
        if (root.right != null) {
            right = hasPath(root.right, cur, sum);
        }
        return left || right;
    }
}
