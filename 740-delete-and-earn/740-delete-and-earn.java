class Solution {
    public int deleteAndEarn(int[] nums) {
        int in=0;
        int e=0;
        
        int[] count=new int[10001];
        
        for(int val:nums) count[val]++;
        
        for(int i=0;i<count.length;i++){
            int ni=count[i]*i + e;
            int ne=Math.max(in,e);
            
            in=ni;
            e=ne;
        }
        return Math.max(in,e);
    }
}