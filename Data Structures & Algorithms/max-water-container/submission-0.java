class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1;
        int mostWater=0;
        while(i<j)
        {
            if(heights[i]>heights[j])
            {
                mostWater=Math.max(mostWater,(Math.min(heights[i],heights[j])*(j-i)));
                j--;
            }
            else{
                mostWater=Math.max(mostWater,(Math.min(heights[i],heights[j])*(j-i)));
                i++;
            }
        }
        return mostWater;
        
    }
}
