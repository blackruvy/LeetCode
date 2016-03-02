package LeetCode;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		return isValidBSTHelper(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
	}
	public boolean isValidBSTHelper(TreeNode node, double min, double max){
		if (node == null){
			return true;
		}
		if(node.val >= max || node.val <= min){
			return false;
		}
		return isValidBSTHelper(node.left, min, node.val) && isValidBSTHelper(node.right, node.val, max);
	}
}
