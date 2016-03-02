package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {
//	public List<Integer> inorderTraversal(TreeNode root) {
//		List<Integer> res = new ArrayList<Integer>();
//		helper(res, root);
//		return res;
//	}
//	
//	public void helper(List<Integer> res, TreeNode root){
//		if(root == null) return;
//		helper(res, root.left);
//		res.add(root.val);
//		helper(res, root.right);
//	}
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		while(root != null || !stack.isEmpty()){
			if(root != null){
				stack.push(root);;
				root = root.left;
			}
			else{
				root = stack.pop();
				res.add(root.val);
				root = root.right;
			}
		}
		return res;
	}
}
