package LeetCode;

public class SearchforaRange {
	public int[] searchRange(int[] nums, int target) {
		int[] res = {-1,-1};
		if(nums == null || nums.length == 0){
			return res;
		}
        int ll = 0, rl = 0;
        int rr = nums.length-1, lr = nums.length-1;
        int mid = 0;
        while(ll <= lr){
        	mid = (ll + lr) / 2;
        	if(nums[mid] < target){
        		ll = mid + 1;
        	}
        	else{
        		lr = mid - 1;
        	}
        }
        while(rl <= rr){
        	mid = (rl + rr)/2;
        	if(nums[mid] <= target){
        		rl = mid + 1;
        	}
        	else{
        		rr = mid - 1;
        	}
        }
        if(ll <=  rr){
        	res[0] = ll;
        	res[1] = rr;
        }
		return res;
    }
}
