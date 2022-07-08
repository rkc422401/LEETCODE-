class Solution {
    public int longestPalindromeSubseq(String s) {
        //creating the new string 
        String s2="";
        int m=s.length();
        for(int i=m-1;i>=0;i--){
            s2+=s.charAt(i);
        }
        char[] X=s.toCharArray();
        char[] Y=s2.toCharArray();
        int n=s2.length();
        return lcs( X, Y, n, m );
    }
    int lcs( char[] X, char[] Y, int m, int n ){
        int L[][] = new int[m+1][n+1];
 
    /* Following steps build L[m+1][n+1] in bottom up fashion. Note
        that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
    for (int i=0; i<=m; i++)
    {
    for (int j=0; j<=n; j++)
    {
        if (i == 0 || j == 0)
            L[i][j] = 0;
        else if (X[i-1] == Y[j-1])
            L[i][j] = L[i-1][j-1] + 1;
        else
            L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
    }
    }
return L[m][n];
    }
}