package LeetCode;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null){
			return true;
		}
		return isSymmectriHelper(root.left, root.right);
	}
	public boolean isSymmectriHelper(TreeNode l, TreeNode r){
		if(l == null && r == null){
			return true;
		}
		else if(l == null || r == null){
			return false;
		}
		if(l.val != r.val){
			return false;
		}
			return isSymmectriHelper(l.left, r.right) && isSymmectriHelper(l.right, r.left);
	}
}
