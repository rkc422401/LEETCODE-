class Solution {
    public int combinationSum4(int[] nums, int target) {
        //changing varibles ke dop
        int[] dp=new int[target+1];
        //Arrays.fill(dp,-1);
        dp[0]=1;
        for(int i=1;i<=target;i++){
            for(int n:nums){
                if(n<=i){
                    dp[i]+=dp[i-n];
                }
            }
        }
        return dp[target];
    }
}
