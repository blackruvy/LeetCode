package LeetCode;

public class ReverseWordsinaString {
	public String reverseWords(String s) {
		if(s == null){
			return null;
		}
		if(s.length() == 0){
			return "";
		}
		String[] ss = s.split(" ");
		if(ss.length == 0) return "";
		String rst = "";
		for(int i = ss.length - 1; i >= 0; i--){
			if(!ss[i].equals("")) rst += ss[i] + " "; 
		}
		return rst.substring(0, rst.length()-1);
	}
//	public static void main(String[] args){
//		String s = "a";
//		String[] ss = s.split(" ");
//		for(int i = 0; i < ss.length; i++){
//			System.out.println(ss[i]);
//		}
//		
//	}
}
