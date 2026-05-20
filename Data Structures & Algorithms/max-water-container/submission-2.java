class Solution {
    public int maxArea(int[] heights) {

        int left = 0, right = heights.length-1;
        int maxi = 0;

        while(left<right)
        {
            int currArea = Math.min(heights[right],heights[left])*(right-left);
            if(heights[left] < heights[right])
            {
                left++;
            }
            else{
                right--;
            }

            maxi = Math.max(currArea, maxi);
        }
        return maxi;
        
    }
}
