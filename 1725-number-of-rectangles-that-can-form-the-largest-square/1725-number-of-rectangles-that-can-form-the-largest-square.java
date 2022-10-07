class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxValue = 0;
        for(int i = 0; i < rectangles.length; i++) {
            int actualMax = Math.min(rectangles[i][0], rectangles[i][1]);
            maxValue = Math.max(actualMax, maxValue); 
        }
        int count = 0;
        for(int i = 0; i < rectangles.length; i++) {
            if(rectangles[i][0] >= maxValue && rectangles[i][1] >= maxValue) {
                count++;
            }
        }
        return count;
    }
}