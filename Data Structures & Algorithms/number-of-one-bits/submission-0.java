class Solution {
    public int hammingWeight(int n) {
        int ans=0;

        while(n>0)
        {
            int k=n%2;
            if(k ==1)
            {
                ans++;
            }
            n/=2;
        }
        return ans;
        
    }
}
