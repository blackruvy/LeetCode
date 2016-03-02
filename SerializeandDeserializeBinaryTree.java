//package LeetCode;
//
//public class SerializeandDeserializeBinaryTree {
//	// Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//    	if (root == null){
//    		return -1 + "";
//    	}
//    	String rst = serializeHelper(root, "");
//    	return rst;
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        
//    }
//    
//    public String serializeHelper(TreeNode node, String rst){
//    	if(node == null){
//    		rst += -1;
//    		return rst;
//    	}
//    	else{
//    		rst += node.val;
//    		rst = serializeHelper(node.left, rst);
//    		
//    	}
//    	if(node.right == null){
//    		rst += -1;
//    		return rst;
//    	}
//    	else{
//    		rst += node.right.val;
//    		return serializeHelper(node.right, rst);
//    	}
//    }
//}
