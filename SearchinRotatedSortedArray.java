package LeetCode;

public class SearchinRotatedSortedArray {
	public int search(int[] nums, int target) {
		if(nums == null || nums.length == 0){
			return -1;
		}
		int l = 0;
		int r = nums.length - 1;
		int m;
		while(l <= r){
			m = (l + r)/2;
			if(nums[m] == target) return m;
			if(nums[m] < nums[r]){
				if(nums[m] < target && nums[r] >= target){
					l = m + 1;
				}
				else{
					r = m - 1;
				}
			}
			else{
				if(nums[m] > target && nums[l] <= target){
					r = m - 1;
				}
				else{
					l = m + 1;
				}
			}
			
		}return -1;
	}
}
