package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostorderTraversal {
//	public List<Integer> postorderTraversal(TreeNode root) {
//		List<Integer> res = new ArrayList<Integer>();
//		helper(res, root);
//		return res;
//	}
//	
//	public void helper(List<Integer> res, TreeNode root){
//		if(root == null) return;
//		helper(res, root.left);
//		helper(res, root.right);
//		res.add(root.val);
//	}
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		if(root == null){
			return res;
		}
		stack.push(root);
		TreeNode pre = null;
		while(!stack.isEmpty()){
			TreeNode crr = stack.peek();
			if(pre == null || pre.left == crr || pre.right == crr){
				if(crr.left != null){
					stack.push(crr.left);
				}
				else if(crr.right != null){
					stack.push(crr.right);;
				}
				else{
					res.add(crr.val);
					crr = stack.pop();
				}
			}
			else if(crr.left == pre && crr.right != null){
				stack.push(crr.right);
			}
			else{
				res.add(crr.val);
				stack.pop();
			}
			pre = crr;
		}
		return res;
	}
}
