class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] tail=new int[n];
        tail[0]=nums[0];
        int len=1;
        for(int i=1;i<n;i++){
            if(nums[i] > tail[len-1]){
                tail[len]=nums[i];
                len++;
            }
            else{
                int c=bs(tail,0,len-1,nums[i]);
                tail[c]=nums[i];
            }
        }
        return len;
    }
    int bs(int[] tail,int l,int r,int x){
        while(r>l){
            int m=l+(r-l)/2;
            if(tail[m] >=x) r=m;
            else l=m+1;
        }
        return r;
    }
}