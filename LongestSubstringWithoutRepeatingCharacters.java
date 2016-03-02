package LeetCode;

public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}
		char[] arr = s.toCharArray();
		int temp = 1, start = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = start; j < i; j++) {
				if (arr[i] == arr[j]) {
					temp = Math.max(temp, i - start);
					start = j + 1;
					i = start;
				}
			}
		}
		return Math.max(temp, s.length() - start);
	}

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println(lengthOfLongestSubstring("bdb"));
		System.out.println("The end");
	}
}
