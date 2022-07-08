class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int num:nums){
            map.add(num);
        }
        
        int ans=0;
        for(int num:nums){
            if(!map.contains(num-1)){
                int count=1;
                int curr=num+1;
                while(map.contains(curr)){
                    count++;
                    curr++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}