class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        fill(image,sr,sc,image[sr][sc],color);
        return image;
    }
    void fill(int[][] image, int sr, int sc, int oc, int color){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc] !=oc) return;
        image[sr][sc]=color;
        fill(image,sr+1,sc,oc,color);
        fill(image,sr-1,sc,oc,color);
        fill(image,sr,sc+1,oc,color);
        fill(image,sr,sc-1,oc,color);
    }
}