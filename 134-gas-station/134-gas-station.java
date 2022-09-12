class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int g=0;
        int c=0;
        for(int i=0;i<gas.length;i++){
            g+=gas[i];
            c+=cost[i];
        }
        if(g<c) return -1;
        
        //main logic
        
        int tg=0;
        int ans=0;
        for(int i=0;i<gas.length;i++){
            tg+=gas[i]-cost[i];
            if(tg<0){
                ans=i+1;
                tg=0;
            }
        }
        return ans;
    }
}