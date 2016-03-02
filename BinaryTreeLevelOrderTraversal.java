package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null){
			return res;
		}
		int count = 1;
		int num = 0;
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		List<Integer> temp = new ArrayList<Integer>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode crr = queue.poll();
			count--;
			temp.add(crr.val);
			if(crr.left != null){
				queue.add(crr.left);
				num++;
			}
			if(crr.right != null){
				queue.add(crr.right);
				num++;
			}
			if(count == 0){
				count = num;
				res.add(temp);
				temp = new ArrayList<Integer>();
				num = 0;
			}
		}
		List<List<Integer>> ress = new ArrayList<List<Integer>>();
		for(int i = res.size() - 1; i >= 0; i--){
			ress.add(res.get(i));
		}
		return ress;
	}
}
