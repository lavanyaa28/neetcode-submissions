class Solution {
    public int characterReplacement(String s, int k) {

        // sliding window
        // how to use sliding window
        int maxLength=0;

        for(int n=s.length()-1;n>=1;n--)
        {
            int i=0,j=i+n;
            while(j<=s.length()-1)
            {
                HashMap<Character, Integer> hm = countChar(s,i,j);
                int maxValue = Collections.max(hm.values()); 
                if((j - i + 1) - maxValue <= k)
                {
                    maxLength=Math.max(maxLength,n);
                }
                i++; j++;
            }
        }
        return maxLength+1;
    }
     


    public HashMap<Character, Integer> countChar(String s,int i,int j)
    {
        HashMap <Character, Integer> hm = new HashMap<>();
        for(int k=i;k<=j;k++)
        {
            char ch=s.charAt(k);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        // System.out.println(hm);
        return hm;
    }
}
