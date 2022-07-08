class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        //base condition 
        int n=text1.length();
        int m=text2.length();
        int[][] dp = new int[n + 1][m + 1];
    for(int i=0;i<n + 1;i++){
      for(int j=0;j<m + 1;j++){
        dp[i][j] = -1;
      }
    }
        return lcs(text1,text2,n,m,dp);
    }
    int lcs(String t1, String t2,int n,int m,int[][] dp){
        if(n==0 || m==0) return 0;
        
        if (dp[n][m] != -1)
      return dp[n][m];
        
        if(t1.charAt(n-1)==t2.charAt(m-1)){
            return dp[n][m]= 1+lcs(t1,t2,n-1,m-1,dp);
        }
        else{
            return dp[n][m]=Math.max(lcs(t1,t2,n,m-1,dp),lcs(t1,t2,n-1,m,dp));
        }
    }
}