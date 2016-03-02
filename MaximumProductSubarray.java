package LeetCode;

public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
        if(nums.length == 0 || nums == null){
        	return 0;
        }
        int localMax = nums[0];
        int globe = nums[0];
        int localMin = nums[0];
        for(int i = 1; i < nums.length; i++){
        	int maxCopy = localMax;
        	localMax = Math.max(Math.max(nums[i], localMax*nums[i]),nums[i]*localMin);
        	localMin = Math.min(Math.min(nums[i], maxCopy*nums[i]),nums[i]*localMin);
        	globe = Math.max(localMax, globe);
        }
        return globe;
    }
}
