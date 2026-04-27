class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n];
        for(int i=0;i<n;i++)
        {
            memo[i]=-1;
        }
        return climbStairsHelper(0, memo,n);
    }

    public int climbStairsHelper(int i, int[] memo, int n)
    {
        if(i == n || i== n-1)
        {
            return 1;
        }

        if(memo[i]!=-1)
        {
            return memo[i];
        }
        int oneStep = climbStairsHelper(i+1, memo, n);
        int twoStep = climbStairsHelper(i+2, memo, n);
        return memo[i]= oneStep + twoStep;
    }
}
