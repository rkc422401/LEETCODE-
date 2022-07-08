class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcp=strs[0];
        for(int i=1;i<strs.length;i++){
            String curr=strs[i];
            int j=0;
            while(j<lcp.length() && j<curr.length() && lcp.charAt(j)==curr.charAt(j)) j++;
            if(j==0) return "";
            lcp=lcp.substring(0,j);
        }
        return lcp;
    }
}