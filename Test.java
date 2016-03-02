package LeetCode;

import java.util.Arrays;

public class Test {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
		arr = Arrays.copyOfRange(arr, 0, 3);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
	}
}
