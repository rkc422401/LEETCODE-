class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg=0;
        int tc=0;
        for(int i=0;i<gas.length;i++){
            tg+=gas[i];
            tc+=cost[i];
        }
        if(tg<tc) return -1;
        
        //main logic
        int gt=0;
        int ans=0;
        for(int i=0;i<gas.length;i++){
            gt+=gas[i]-cost[i];
            if(gt<0){
                ans=i+1;
                gt=0;
            }
        }
        return ans;
    }
}

