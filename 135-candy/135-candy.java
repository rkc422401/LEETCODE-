class Solution {
    public int candy(int[] ratings) {
        int candy = 1;
        int slopeStart = 0;
        int lastCandy = 1;
        int lastPeakCandy = 1;
        for(int i = 1; i < ratings.length; i++) {
            if (ratings[i - 1] < ratings[i]) {
                slopeStart = i;
                candy += ++lastCandy;
                lastPeakCandy = lastCandy;
            }
            else if (ratings[i - 1] == ratings[i]) {
                slopeStart = i;
                ++candy;
                lastCandy = 1;
                lastPeakCandy = 1;
            }
            else {
                int slopeLength = i - slopeStart;
                candy += slopeLength;
                lastCandy = 1;
                if (slopeLength >= lastPeakCandy) {
                    ++lastPeakCandy;
                    ++candy;
                }
            }
        }
        return candy;
    }
}
