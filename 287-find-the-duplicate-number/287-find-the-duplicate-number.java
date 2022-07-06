class Solution {
    public int findDuplicate(int[] nums) {
        //this takes the concept of the linke dlist cycle 
        int slow=nums[0];
        int fast=nums[0];
        slow=nums[slow];
        fast=nums[nums[fast]];
        while(slow !=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        
        fast=nums[0];
        while(slow !=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}