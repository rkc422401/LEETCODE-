class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i:piles){
            max=Math.max(max,i);
        }
        if(h==piles.length) return max;
        
        int low=0;
        int high=max;
        int speed=Integer.MAX_VALUE;
        
        while(low<=high){
            int sp=low+(high-low)/2;
            
            if(ispossible(piles,h,sp)){
                speed=sp;
                high=sp-1;
            }
            else{
                low=sp+1;
            }
        }
        return speed;
    }
    boolean ispossible(int[] arr,int h,int sp){
        int time=0;
        
        for(int i=0;i<arr.length;i++){
            time+=(int)Math.ceil(arr[i]*1.0/sp);
        }
        return time<=h;
    }
}