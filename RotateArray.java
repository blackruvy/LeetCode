package LeetCode;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		if(nums == null || nums.length == 0){
			return;
		}
		while(k >= nums.length){
			k -= nums.length;
		}
		int[] rst = new int[nums.length];
		for(int i = 0; i < nums.length; i++){
			int temp = i + k;
			if(temp >= nums.length){
				temp -= nums.length;
			}
			rst[temp] = nums[i];
		}
		for(int i = 0; i < nums.length; i++){
			nums[i] = rst[i];
		}
	}
}
