package LeetCode;

public class Searcha2DMatrix {
	public static final int INITIAL = 0;

	public static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int lc = 0;
		int rc = matrix.length - 1;
		int mc;
		while (lc <= rc) {
			mc = (lc + rc) / 2;
			if (matrix[mc][INITIAL] > target) {
				rc = mc - 1;
			} else if (matrix[mc][INITIAL] < target) {
				lc = mc + 1;
			} else {
				return true;
			}
		}
		if(rc < 0){
			return false;
		}
		System.out.println(rc);
		int l = 0;
		int r = matrix[rc].length - 1;
		int m;
		while (l <= r) {
			m = (l + r) / 2;
			if (matrix[rc][m] > target) {
				r = m - 1;
			} else if (matrix[rc][m] < target) {
				l = m + 1;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 } };
		System.out.println(searchMatrix(matrix, 8));
	}
}
