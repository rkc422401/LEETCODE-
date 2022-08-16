class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        
        int res=0;
        int cur=0;
        for(int i=0;i<values.length;i++){
            res=Math.max(res,cur+values[i]);
            cur=Math.max(cur,values[i])-1;
        }
        return res;
        
    }
}




