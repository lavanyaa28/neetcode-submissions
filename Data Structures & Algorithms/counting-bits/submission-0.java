class Solution {

    public int bitCountFunction(int i)
    {
        int ans = 0;
        while(i>0)
        {
            if(i%2==1)
            {
                ans++;
            }
            i/=2;
        }

        return ans;
    }
    public int[] countBits(int n) {

        int[] ans= new int[n+1];

        for(int i=0;i<=n;i++)
        {
            ans[i]=bitCountFunction(i);
        }
        return ans;        
    }
}
