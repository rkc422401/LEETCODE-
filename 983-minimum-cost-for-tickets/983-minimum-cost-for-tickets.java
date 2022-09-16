class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp=new int[400];
        Arrays.fill(dp,-1);
        return f(days[0],days,costs,dp);
    }
    int f(int cday,int[] days,int[] costs,int[] dp){
        if(cday > days[days.length-1]) return 0;
        if(dp[cday] != -1) return dp[cday];
        int ans=(int)1e8;
        if(wit(cday,days)){
            ans=costs[0] + f(cday+1,days,costs,dp);
            ans=Math.min(ans,costs[1]+ f(cday+7,days,costs,dp));
            ans=Math.min(ans,costs[2]+ f(cday+30,days,costs,dp));
        }
        else{
            return f(cday+1,days,costs,dp);
        }
        return dp[cday]=ans;
    }
    boolean wit(int cday,int[] days){
        for(int i=0;i<days.length;i++){
            if(cday==days[i]) return true;
        }
        return false;
    }
}