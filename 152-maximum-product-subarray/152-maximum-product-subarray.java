class Solution {
    public int maxProduct(int[] nums) {
        //now what i say that the ans will be at the start or at the emd of the array 
        int ans=Integer.MIN_VALUE;
        int cp=1;
        for(int i=0;i<nums.length;i++){
            cp*=nums[i];
            ans=Math.max(ans,cp);
            if(cp==0) cp=1;
        }
        
        cp=1;
        for(int i=nums.length-1;i>=0;i--){
            cp*=nums[i];
            ans=Math.max(ans,cp);
            if(cp==0) cp=1;
        }
        return ans;
    }
}
//so the time complexity of this solution will be the o(n) ans the sapce complexity will be the o(1);