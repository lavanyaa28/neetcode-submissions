class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        String str="";
        int lastLength=0;
        int j=0;
        for(int i=0;i<s.length() && j<s.length();i++)
        {
            if(hs.contains(s.charAt(i)))
            {                
                lastLength=Math.max(lastLength,str.length());
                str="";
                hs.clear();
                j++;
                i=j;
            }
                str+=s.charAt(i);
                hs.add(s.charAt(i));
        }
        lastLength=Math.max(lastLength,str.length());
        return lastLength;
    }
}
