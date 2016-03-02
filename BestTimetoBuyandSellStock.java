package LeetCode;

public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0){
			return 0;
		}
        int best = 0;
        int diff = 0;
        int temp = prices[0];
        for(int i = 0; i < prices.length; i++){
        	if(prices[i] < temp){
        		temp = prices[i];
        	}
        	diff = prices[i] - temp;
        	if(diff > best){
        		best = diff;
        	}
        }
        return best;
    }
}
