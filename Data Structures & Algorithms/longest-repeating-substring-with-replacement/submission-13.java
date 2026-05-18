class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left=0, mx=0, ans = 0;

        for(int right = 0; right<s.length(); right++)
        {
            char ch = s.charAt(right);
            int chIdx = ch-'A';

            freq[chIdx]++;

            mx = Math.max(mx, freq[chIdx]);
            int windowSize = right-left+1;

            if(windowSize-mx>k)
            {
                int leftIdx = s.charAt(left) - 'A';
                freq[leftIdx]--;
                left++;
            }
        }
        return s.length()-left;
    }
}
