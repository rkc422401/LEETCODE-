class Solution {
    public int maxProduct(int[] nums) {
        //two methord to solve this problem in the time ocmplexity of n2 and the time complexity of n 
        //n2 
        int res=nums[0];
        for(int i=0;i<nums.length;i++){
            int mul=nums[i];
            for(int j=i+1;j<nums.length;j++){
                res=Math.max(res,mul);
                mul=mul*nums[j];
            }
            res=Math.max(res,mul);
        }
        return res;
    }
}