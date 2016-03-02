package LeetCode;

public class MaxiumumSubarray {
	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0){
			return 0;
		}
		int globe = nums[0];
		int local = nums[0];
		for(int i = 1; i < nums.length; i++){
			local = Math.max(nums[i], local+nums[i]);
			globe = Math.max(globe, local);
		}
		return globe;
	}
}
