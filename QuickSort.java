package LeetCode;

public class QuickSort {
	public static int[] quickSort(int[] input) {
		int[] rst = new int[input.length];
		int pivot = (int)(Math.random()*input.length);
		quickSortHelper(input, rst, pivot, 0, input.length - 1);
		return rst;
	}
	
	public static void quickSortHelper(int[] input, int[] rst, int pivot, int left, int right){
		if(left < right){
			int leftCopy = left;
			int rightCopy = right;
			int index = left;
			while(left < right){
				if(index == pivot){
					index++;
				}
				else if(input[index] < input[pivot]){
					rst[left] = input[index];
					left++;
					index++;
				}else{
					rst[right] = input[index];
					right--;
					index++;
				}
			}
			rst[left] = input[pivot];
			for(int i = leftCopy; i <= rightCopy; i++){
				input[i] = rst[i];
			}
			int newPivotLeft = (int)(Math.random()*(left - leftCopy) + leftCopy);
			quickSortHelper(input, rst, newPivotLeft, leftCopy, left);
			int newPivotRight = (int)(Math.random()*(rightCopy - left - 1) + pivot + 1);
			quickSortHelper(input, rst, newPivotRight, left + 1, rightCopy);
		}
	}
	
	public static void main(String[] args){
		int[] test = {5,8,11,15,3,2,1};
		int[] rst = QuickSort.quickSort(test);
 		for(int i =0; i < test.length; i++){
			System.out.println(rst[i]);
		}
	}
}
