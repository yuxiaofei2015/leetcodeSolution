package solution;

import reference.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuxiaofei on 2016/1/24.
 */
public class Q107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        calculateResult(result, root, 0);
        return result;
    }

    public void calculateResult(List<List<Integer>> result, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (result.size() == level) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            result.add(0, list);
        } else {
            result.get(result.size() - 1 - level).add(root.val);
        }
        calculateResult(result, root.left, level + 1);
        calculateResult(result, root.right, level + 1);
    }
}
