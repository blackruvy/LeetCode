package LeetCode;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		boolean rst = true;
		return isSameTreeHelper(p, q, rst);
	}
	
	public boolean isSameTreeHelper(TreeNode p, TreeNode q, Boolean rst){
		if(p == null && q == null){
			return rst;
		}
		else if((q == null && p != null) || (q != null & p == null)){
			return false;
		}
		if(q.val != p.val) return false;
		return isSameTreeHelper(p.left, q.left, rst) && isSameTreeHelper(p.right, q.right, rst);
	}
}
