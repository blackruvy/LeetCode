//package LeetCode;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class ThreeSum {
//	public List<List<Integer>> threeSum(int[] nums) {
//		int left,right,now;
//		Arrays.sort(nums);
//		List<Integer> tmp = new ArrayList<Integer>();
//		List<List<Integer>> rst = new ArrayList<tmp>();
//		for(int i = 0; i < nums.length; i++){
//			left = i + 1;
//			right = nums.length - 1;
//			now = 0 - nums[i]; 
//			while(left < nums.length - 1){
//				if(nums[left] + nums[right] == now){
//					rst.add(reorder(nums[i], nums[left], nums[right]));
//					while(left < right && nums[left] == nums[left - 1]) left++;
//					while(left < right && nums[right] == nums[right + 1]) right--;
//					left++;
//					right--;
//				}
//				else if(nums[left] + nums[right] < now){
//					left++;
//				}
//				else{
//					right--;
//				}
//				if(i < nums.length - 1){
//					while(nums[i] == nums[i + 1]) i++;
//				}
//			}
//		}
//		
//		return rst;
//	}
//	
//	public ArrayList<Integer> reorder(int x, int y, int z){
//		ArrayList<Integer> rst = new ArrayList<Integer>();
//		rst.add(Math.max(x, Math.max(y, z)));
//		if((x <= y && x >= z) ||(x <= z && x >= y)){
//			rst.add(x);
//		}else if((y <= x && y >= z) || (y <= z && y >= x)){
//			rst.add(y);
//		}else if((z <= x && z >= y) || (z <= y && z >= x)){
//			rst.add(z);
//		}
//		rst.add(Math.min(x, Math.min(y, z)));
//		return rst;
//	}
//}
