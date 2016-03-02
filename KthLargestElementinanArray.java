package LeetCode;

public class KthLargestElementinanArray {
//	public int findKthLargest(int[] nums, int k) {
//		if (nums == null || nums.length == 0){
//			return 0;
//		}
//		if(k < 0 || k > nums.length){
//			return 0;
//		}
//		if(nums.length == 1 && k == 1){
//			return nums[0];
//		}
//		int[] rst = new int [nums.length];
//		mergeSort(nums, rst, 0, nums.length - 1);
//		return rst[k - 1];
//	}
//	
//	public void mergeSort(int[] nums, int[] rst, int left, int right){
//		if(left < right){
//			int mid = (left + right) / 2;
//			mergeSort(nums, rst, left, mid);
//			mergeSort(nums, rst, mid + 1, right);
//			merge(nums, rst, left, mid, right);
//		}
//	}
//	
//	public void merge(int[] nums, int[] rst, int leftStart, int leftEnd, int rightEnd){
//		int rightStart = leftEnd + 1;
//		int index = leftStart;
//		int leftBound = leftStart;
//		while(leftStart <= leftEnd && rightStart <= rightEnd){
//			if(nums[leftStart] > nums[rightStart]){
//				rst[index++] = nums[leftStart++];
//			}else{
//				rst[index++] = nums[rightStart++];
//			}
//		}
//		while(leftStart <= leftEnd){
//			rst[index++] = nums[leftStart++];
//		}
//		while(rightStart <= rightEnd){
//			rst[index++] = nums[rightStart++];
//		}
//		for(int i = leftBound; i <= rightEnd; i++){
//			nums[i] = rst[i];
//		}
	
	public int findKthLargest(int[] nums, int k) {
		if (nums == null || nums.length == 0){
			return 0;
		}
		if(k < 0 || k > nums.length){
			return 0;
		}
		if(nums.length == 1 && k == 1){
			return nums[0];
		}
		
	}
	
	public static void main(String[] args){
		KthLargestElementinanArray obj = new KthLargestElementinanArray();
		int[] nums = {1};
		System.out.println(obj.findKthLargest(nums, 1));
		
		}
}
