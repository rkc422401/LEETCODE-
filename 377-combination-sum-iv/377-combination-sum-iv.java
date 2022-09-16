class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        
        int[] dp=new int[target+1];
        Arrays.fill(dp,-1);
        int res=f(nums,target,dp);
        
        
        return res;
    }
    int f(int[] nums,int target,int[] dp){
        if(target==0) return 1;
        if(dp[target] != -1) return dp[target];
        int resi=0;
        for(int i:nums){
            if(i<=target){
                resi+=f(nums,target-i,dp);
            }
        }
        return dp[target]=resi;
    }
}