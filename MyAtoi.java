package LeetCode;

public class MyAtoi {
	/*
	 * 1. null or empty string
	 * 2. white spaces
	 * 3. +/- sign
	 * 4. calculate real value
	 * 5. handle min & max
	 */
	public int myAtoi(String str) {
		if (str.length() == 0 || str == null){
			return 0;
		}
		str = str.trim();
		int i = 0;
		char flag = '+';
		if(str.charAt(0) == '-'){
			i++;
			flag = '-';
		}else if(str.charAt(0) == '+'){
			i++;
			flag = '+';
		}
		double rst = 0;
		while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
			rst = rst * 10 + (str.charAt(i) - '0');
			i++;
		}
		if(flag == '-'){
			rst = -rst;
		}
		if(rst > Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}
		if(rst < Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		return (int)rst;
		
	}
}
