class Solution {
    public int maxProfit(int[] prices) {
        //max profit kitna ban sakta hai 
        //transaction is unlimited 
          int ans=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] >= prices[i-1]) ans+=prices[i]-prices[i-1];
        }
        return ans;
    }
}
// store =4+3=7
//    7 1 5 3 6 4
//         5-1=4   
//             6-3=3

// time complexity :-> o(n)  only taking one loop
//space complexity :-> 0(1) no extra space 

              