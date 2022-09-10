class Solution {
    public int singleNonDuplicate(int[] nums) {
        //so ther are the two ways to solve this the first way is the XOR and the secound is the binary search the tc of the 1 is the o(n) and the 2 nd is the log(n)
        int low=0;
        int high=nums.length-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==nums[mid^1]){
                //this is the left
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return nums[low];
    }
}



//so in this we have to find teh break point the keft and the right
//the left side is the 
//left mai even -->  1st and odd --> 2nd