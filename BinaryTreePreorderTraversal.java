package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {
//	public List<Integer> preorderTraversal(TreeNode root) {
//		List<Integer> res = new ArrayList<Integer>();
//		helper(res, root);
//		return res;
//	}
//	
//	public void helper(List<Integer> res, TreeNode root){
//		if(root == null) return;
//		res.add(root.val);
//		helper(res, root.left);
//		helper(res, root.right);
//	}
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		while(root != null || !stack.isEmpty()){
			if(root != null){
				res.add(root.val);
				stack.push(root);
				root = root.left;
			}
			else{
				root = stack.pop();
				root = root.right;
			}
		}
		return res;
	}
}
