package LeetCode;

import java.util.Arrays;

public class WiggleSort {
	public static void wiggleSort(int[] nums) {
		if (nums == null || nums.length < 2) {
			return;
		}
		Arrays.sort(nums);
		int len = nums.length;
		int[] rst = new int[len];
		int i = 0;
		for (i = 0; i < len / 2; i++) {
			rst[2 * i] = nums[i];
			rst[2 * i + 1] = nums[len - i - 1];
		}
		if (nums.length % 2 == 1) {
			rst[2 * i] = nums[i];
		}

		for (int j = 0; i < nums.length; i++) {
			nums[j] = rst[j];
		}
		// for (int i = 1; i < nums.length; i++) {
		// if ((i % 2 == 1 && nums[i] < nums[i - 1])
		// || (i % 2 == 0 && nums[i] > nums[i - 1])) {
		// int temp = nums[i];
		// nums[i] = nums[i - 1];
		// nums[i - 1] = temp;
		// }
		// }
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		wiggleSort(nums);
	}
}
