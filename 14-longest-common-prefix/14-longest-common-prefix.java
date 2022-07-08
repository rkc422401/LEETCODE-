class Solution {
    public String longestCommonPrefix(String[] strs) {
        //so in this we have to take the first element of teh char array as the lcp of the whool array and then at the next step w ehave to start the loop from the i=1 to the end o fthe string and we have to comapye allthe other elemnet in that char array whic h the lonegst common prefix 
        if(strs==null || strs.length ==0) return "";
        String lcp=strs[0];
        for(int i=1;i<strs.length;i++){
            String curr=strs[i];
            int j=0;
            while(j<curr.length() && j<lcp.length() && curr.charAt(j)==lcp.charAt(j)){
                j++;
            }
            if(j==0) return "";
            lcp=lcp.substring(0,j);
        }
        return lcp;
    }
}