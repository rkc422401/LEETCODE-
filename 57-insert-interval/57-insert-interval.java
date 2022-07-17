class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //so there are three points that we have to considered to solve the problem 
        // the first is that we have new interval ans its 0 index is greater than the 1 index of the running interval
        //the secound is that if the new index 1 index is loewer than the 0 index of the current index in that case we have to add the new index in the nas were and then we have ro make the current index as the new index and afterthe lopp is ob=ver we have to add the new idex to the list and convert he list to the correct output format 
        
        
        List<int[]> result=new ArrayList();
        for(int[] in : intervals){
            if(in[1] < newInterval[0]){
                result.add(in);
            }
            else if(newInterval[1] < in[0]){
                result.add(newInterval);
                newInterval=in;
            }
            else{
                newInterval[0]=Math.min(newInterval[0],in[0]);
                newInterval[1]=Math.max(newInterval[1],in[1]);
            }
        }
        result.add(newInterval);
        
        return result.toArray(new int[result.size()][]);
    }
}