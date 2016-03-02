package LeetCode;

public class PalindromeNumber {
	public boolean isPalindrome(int x){
		if(x < 0){
			return false;
		}
		int digit = 1;
		while(x / digit >= 10){
			digit *= 10;
		}
		int left,right;
		while(x != 0){
			left = x / digit;
			right = x % 10;
			if(left != right){return false;}
			x = (x % digit) / 10;
			digit = digit / 100;
		}
		return true;
	}
}
