class Solution {
    public List<List<Integer>> permute(int[] nums) {
        //step 1: to make the answere list 
        List<List<Integer>> ans=new ArrayList();
        helper(0,nums,ans);
        return ans;
    }
    //step 2: to make the helper methord
    void helper(int index,int[] nums,List<List<Integer>> ans){
        //now base condition 
        if(index==nums.length){
            List<Integer> temp=new  ArrayList();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        //now visit every index from index 0 to nums.length
        for(int i=index;i<nums.length;i++){
            //now swap the index and the i
            swap(index,i,nums);
            helper(index+1,nums,ans);
            swap(index,i,nums);      //reswap for the backtracking 
        }
    }
    void swap(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}