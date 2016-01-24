package solution;

import java.util.ArrayList;
import java.util.List;

import reference.TreeNode;

public class Q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root != null) {
            boolean hasNextLine = root.left != null || root.right != null;
            List<Integer> firstLine = new ArrayList<>();
            firstLine.add(root.val);
            result.add(firstLine);

            List<TreeNode> firstListTreeNode = new ArrayList<TreeNode>();
            firstListTreeNode.add(root);
            List<TreeNode> preLine = firstListTreeNode;
            while (hasNextLine) {
                hasNextLine = false;
                List<TreeNode> nextTreeNode = new ArrayList<TreeNode>();
                List<Integer> nextLine = new ArrayList<Integer>();
                for (TreeNode node : preLine) {
                    if (node.left != null) {
                        nextTreeNode.add(node.left);
                        nextLine.add(node.left.val);
                    }
                    if (node.right != null) {
                        nextTreeNode.add(node.right);
                        nextLine.add(node.right.val);
                    }
                }
                result.add(nextLine);
                preLine = nextTreeNode;
                for (TreeNode node : nextTreeNode) {
                    if (node.left != null || node.right != null) {
                        hasNextLine = true;
                        break;
                    }
                }

            }
        }
        return result;
    }

    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        calculateDepth(result, root, 0);
        return result;
    }

    public void calculateDepth(List<List<Integer>> result, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (result.size() == level) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            result.add(list);
        } else {
            result.get(level).add(root.val);
        }
        calculateDepth(result, root.left, level + 1);
        calculateDepth(result, root.right, level + 1);
    }
}