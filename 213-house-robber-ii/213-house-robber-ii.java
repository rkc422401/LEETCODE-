class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(rob(0,nums.length-1,nums),rob(1,nums.length,nums));
    }
    int rob(int start,int end,int[] nums){
        int in=0;
        int ex=0;
        for(int i=start;i<end;i++){
            int nin=nums[i]+ex;
            int nex=Math.max(in,ex);
            
            in=nin;
            ex=nex;
        }
        return Math.max(in,ex);
    }
}