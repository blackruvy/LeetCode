package LeetCode;

import java.util.HashMap;

public class IntegerAndRoman {
	public static String intToRoman(int num) {
		HashMap<Integer, String> ir = new HashMap<Integer, String>();
		ir.put(1, "I");
		ir.put(4, "IV");
		ir.put(5, "V");
		ir.put(9, "IX");
		ir.put(10, "X");
		ir.put(40, "XL");
		ir.put(50, "L");
		ir.put(90, "XC");
		ir.put(100, "C");
		ir.put(400, "CD");
		ir.put(500, "D");
		ir.put(900, "CM");
		ir.put(1000, "M");
		int digit = 1;
		String rst = "";
		while (num / digit >= 10) {
			digit *= 10;
		}
		System.out.println(digit);
		while (num != 0) {
			if (num / digit == 9 || num / digit == 4) {
				rst += ir.get((num / digit) * digit);
				num = num % digit;
				digit = digit / 10;
				continue;
			} else if (num / digit >= 5) {
				rst += ir.get(5 * digit);
				num = num - 5 * digit;

			}
			for (int i = 0; i < num / digit; i++) {
				rst += ir.get(digit);
			}
			num = num % digit;
			digit = digit / 10;
		}
		return rst;
	}

	public static int romanToInt(String s) {
		HashMap<String, Integer> ir = new HashMap<String, Integer>();
		ir.put("I", 1);
		ir.put("IV", 4);
		ir.put("V", 5);
		ir.put("IX", 9);
		ir.put("X", 10);
		ir.put("XL", 40);
		ir.put("L", 50);
		ir.put("XC", 90);
		ir.put("C", 100);
		ir.put("CD", 400);
		ir.put("D", 500);
		ir.put("CM", 900);
		ir.put("M", 1000);
		char[] arr = s.toCharArray();
		int rst = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				if (arr[i] == 'I') {
					if (arr[i + 1] == 'V') {
						rst += ir.get("IV");
						i++;
					} else if (arr[i + 1] == 'X') {
						rst += ir.get("IX");
						i++;
					}else{
						rst += ir.get("I");
					}
				} else if (arr[i] == 'X') {
					if (arr[i + 1] == 'L') {
						rst += ir.get("XL");
						i++;
					} else if (arr[i + 1] == 'C') {
						rst += ir.get("XC");
						i++;
					}else{
						rst += ir.get("X");
					}
				} else if (arr[i] == 'C') {
					if (arr[i + 1] == 'D') {
						rst += ir.get("CD");
						i++;
					} else if (arr[i + 1] == 'M') {
						rst += ir.get("CM");
						i++;
					}else{
						rst += ir.get("C");
					}
				} else {
					rst += ir.get(arr[i] + "");
				}
			}
			else{
				rst += ir.get(arr[i]+"");
			}
		}
		return rst;
	}

	public static void main(String[] args) {
		System.out.println("The roman is : " + romanToInt("MCDXLIX"));
	}
}
