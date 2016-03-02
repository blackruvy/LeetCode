package LeetCode;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if ((nums1 == null || nums1.length == 0)
				&& (nums2 == null || nums2.length == 0)) {
			return 0;
		}
		if (nums1 == null || nums1.length == 0) {
			return findMedian(nums2);
		}
		if (nums2 == null || nums2.length == 0) {
			return findMedian(nums1);
		}
		while (nums1.length > 1 && nums2.length > 1) {
			if (findMedian(nums1) > (findMedian(nums2))) {
				nums1 = cutArray(nums1, 'r');
				nums2 = cutArray(nums2, 'l');
			} else if (findMedian(nums1) < (findMedian(nums2))) {
				nums1 = cutArray(nums1, 'l');
				nums2 = cutArray(nums2, 'r');
			} else
				return findMedian(nums1);
		}
		if (nums1.length == 1 && nums2.length == 1) {
			return (double) (nums1[0] + nums2[0]) / 2;
		}
		if (nums1.length == 1) {
			return findMedian(nums2, nums1[0]);
		} else {
			return findMedian(nums1, nums2[0]);
		}
	}

	public double findMedian(int[] arr) {
		if (arr.length % 2 == 0) {
			return ((double) arr[arr.length / 2 - 1] + (double) arr[arr.length / 2]) / 2;
		} else {
			return (double) arr[arr.length / 2];
		}
	}

	public double findMedian(int[] arr, int num) {
		double med = (double) findMedian(arr);
		if (arr.length % 2 == 0) {
			if (med < (double) num) {
				if ((double) num > (double) arr[arr.length / 2]) {
					return (double) arr[arr.length / 2];
				} else {
					return num;
				}
			} else {
				if ((double) num > (double) arr[arr.length / 2 - 1]) {
					return num;
				} else {
					return (double) arr[arr.length / 2 - 1];
				}
			}
		} else {
			if (med < (double) num) {
				if ((double) num < (double) arr[arr.length / 2 + 1]) {
					return (num + (double) arr[arr.length / 2]) / 2;
				} else {
					return ((double) arr[arr.length / 2] + (double) arr[arr.length / 2 + 1]) / 2;
				}
			} else {
				if ((double) num > (double) arr[arr.length / 2 - 1]) {
					return (num + (double) arr[arr.length / 2]) / 2;
				} else {
					return ((double) arr[arr.length / 2 - 1] + (double) arr[arr.length / 2]) / 2;
				}
			}
		}

	}

	public int[] cutArray(int[] input, char cutPart) {
		int len = input.length / 2;
		if (cutPart == 'l') {
			return Arrays.copyOfRange(input, len, input.length);
		} else if (cutPart == 'r') {
			if (input.length % 2 == 0) {
				return Arrays.copyOfRange(input, 0, len);
			} else {
				return Arrays.copyOfRange(input, 0, len + 1);
			}
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		MedianofTwoSortedArrays rst = new MedianofTwoSortedArrays();
		int[] arr1 = { 1, 2 };
		int[] arr2 = { 3, 4, 5, 6 };
		double rstfinal = rst.findMedianSortedArrays(arr1, arr2);
		System.out.println(rstfinal);

	}
}
