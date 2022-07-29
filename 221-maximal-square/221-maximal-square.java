class Solution {
    public int maximalSquare(char[][] matrix) {
        //so in this what we have to do is that we have to us ethe dp tabulation solution in it 
        // to check the lboundary conditions first
        
        if(matrix==null || matrix.length==0) return 0;
        //create the ans 
        int ans=0;
        //now create the dp aray 
        int[][] dp=new int[matrix.length+1][matrix[0].length+1];
        for(int i=1;i<=matrix.length;i++){
            for(int j=1;j<=matrix[0].length;j++){
                //now creat ethe min to check for the three sides
                //now to first check the condition for the to find the min of the array 
                if(matrix[i-1][j-1]=='1'){
                    int min=Integer.MAX_VALUE;
                    min=Math.min(min,dp[i-1][j]);
                    min=Math.min(min,dp[i-1][j-1]);
                    min=Math.min(min,dp[i][j-1]);
                    
                    dp[i][j]=min+1;
                    ans=Math.max(dp[i][j],ans);
                }
            }
        }
        return ans*ans;
    }
}