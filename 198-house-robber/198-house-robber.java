class Solution {
    public int rob(int[] nums) {
        int in=0;
        int ex=0;
        
        for(int i=0;i<nums.length;i++){
            int nin=nums[i]+ex;
            int nex=Math.max(in,ex);
            
            in=nin;
            ex=nex;
        }
        return Math.max(in,ex);
    }
}