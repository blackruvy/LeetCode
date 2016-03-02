package LeetCode;

public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0 || nums == null){
			return 0;
		}
		int count = 1;
		for(int i = 0; i < nums.length; i++){
			if(nums[count - 1] == nums[i]){
				continue;
			}
			else{
				count++;
				nums[count - 1] = nums[i];
			}
		}
		return count;
	}
}
