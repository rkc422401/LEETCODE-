class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        
        int[] dp=new int[target+1];
        Arrays.fill(dp,-1);
        return f(nums,target,dp);

    }
    int f(int[] nums,int target,int[] dp){
        if(dp[target] != -1) return dp[target];
        if(target==0) return 1;
        
        int resi=0;
        for(int i:nums){
            if(i<=target){
                resi+=f(nums,target-i,dp);
            }
        }
        return dp[target]=resi;
    }
}