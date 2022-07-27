class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //so in this we have to start the seaching from the first row and last index of the first row if the target that we are seaching is greater than the cuerrenet numner then in tat case e gave to go down otherwisw we have to seach left
        
        int n =matrix.length;
        int m=matrix[0].length;
        
        int i=0;
        int j=m-1;
        while(i<n && j>=0){
            if(matrix[i][j]==target) return true;
            if(matrix[i][j] < target) i++;
            else j--;
        }
        return false;
    }
}