package LeetCode;

public class MergeSort {
	/*
	 * split
	 * merge
	 */
	public static int[] myMergeSort(int[] input) {
		if(input == null || input.length < 2){
			return input;
		}
		int[] rst = new int[input.length];
		mergeHelper(input, rst, 0, input.length - 1);
		return rst;
	}

	public static void mergeHelper(int[] input, int[] rst, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2 ;
			mergeHelper(input, rst, left, mid);
			mergeHelper(input, rst, mid + 1, right);
			merge(input, rst, left, mid, right);
		}
	}
	
	public static void merge(int[] input, int[] rst, int leftStart,int leftEnd, int rightEnd){
		int rightStart = leftEnd + 1;
		int index = leftStart;
		int leftStartCopy = leftStart;
		while(leftStart <= leftEnd && rightStart <= rightEnd){
			if(input[leftStart] < input[rightStart]){
				rst[index] = input[leftStart];
				leftStart++;
			}else{
				rst[index] = input[rightStart];
				rightStart++;
			}
			index++;
		}
		while(leftStart <= leftEnd){
			rst[index] = input[leftStart];
			leftStart++;
			index++;
		}
		while(rightStart <= rightEnd){
			rst[index] = input[rightStart];
			rightStart++;
			index++;
		}
		for(int i = leftStartCopy; i <= rightEnd; i++){
			input[i] = rst[i];
		}
	}
	
	public static void main(String[] args){
		int[] test = {1};
		int[] rst = MergeSort.myMergeSort(test);
 		for(int i =0; i < test.length; i++){
			System.out.println(rst[i]);
		}
	}
}
