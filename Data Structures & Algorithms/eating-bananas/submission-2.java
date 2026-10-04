class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // binary search

        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            maxi=Math.max(piles[i],maxi);
        }
        
        int low=1, high = maxi;
        int ans=high;

        while(low<=high)
        {
            int mid = high - ((high-low)/2);
            // int mid = low + (high - low) / 2;
            long curr = 0;
            for(int i=0;i<piles.length;i++)
            {
               curr += (piles[i]+mid-1)/mid;
            }

            if(curr<=h)
            {
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
