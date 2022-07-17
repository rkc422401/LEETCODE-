class Solution {
    public int maxProfit(int[] prices) {
        int obsp=-prices[0];
        int ossp=0;
        int ocsp=0;
        
        for(int i=1;i<prices.length;i++){
            int nbsp=0;
            int nssp=0;
            int ncsp=0;
            
            //bsp
            if(obsp < ocsp-prices[i]) nbsp=ocsp-prices[i];
            else nbsp=obsp;
            
            //ssp
            if(ossp < obsp+prices[i])  nssp=obsp+prices[i];
            else nssp=ossp;
            
            //csp
            if(ocsp < ossp) ncsp=ossp;
            else ncsp=ocsp;
            
            obsp=nbsp;
            ossp=nssp;
            ocsp=ncsp;
        }
        return ossp;
    }
}