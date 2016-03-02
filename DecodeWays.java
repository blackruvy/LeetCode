package LeetCode;

public class DecodeWays {
	/*
	 * 00：res[i]=0 
	 * 10, 20：res[i]=res[i-2] 11-19, 
	 * 21-26：res[i]=res[i-1]+res[i-2]
	 * 01-09, 27-99：res[i]=res[i-1]
	 */
	public int numDecodings(String s) {
        int f1 = 1;//f1: res[i - 2] 自己加上前一位
        int f2 = 1;//f2: res[i - 1] 自己代表自己
        int f3 = 1;//f3: res[i]
        if(s == null || s.length() < 1 || s.charAt(0) == '0'){
        	return 0;
        }
        for(int i = 1; i < s.length(); i++){
        	if(s.charAt(i) == '0'){
        		if(s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2'){
        			f3 = f1;
        		}
        		else{
        			return 0;
        		}
        	}
        	else{
        		if(s.charAt(i-1) == '0' || s.charAt(i-1) >= '3'){
        			f3 = f2;
        		}
        		else{
        			if(s.charAt(i-1) == '2' && s.charAt(i) > '6' && s.charAt(i)<= '9'){
        				f3 = f2;
        			}
        			else{
        				f3 = f2 + f1;
        			}
        		}
        	}
        	f1 = f2;
            f2 = f3;
        }
        return f2;
    }
	
}
