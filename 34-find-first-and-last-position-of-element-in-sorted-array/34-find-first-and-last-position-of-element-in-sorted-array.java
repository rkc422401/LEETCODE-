class Solution {
    public int[] searchRange(int[] nums, int target) {
        //if my answere is not found in that case you have to return this nas and if ans is found then in that cse you have to updte thsi int 
        int[] ans={-1,-1};
        
        //now i have to binary search 
        int low=0;
        int high=nums.length-1;
        
        while(low<=high){
            int mid=low + (high-low)/2;
            
            if(nums[mid]==target){
                ans[0]=mid;
                high=mid-1;
            }
            else if(nums[mid] >= target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low + (high-low)/2;
            
            if(nums[mid]==target){
                ans[1]=mid;
                low=mid+1;
            }
            else if(nums[mid] >= target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}