class Solution {
    public int lengthOfLastWord(String s) {
        int lastWord =0, currWord=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                if(currWord>0)
                {
                    lastWord = currWord;
                    
                }
                currWord=0;
            }
            else{
                currWord++;
            }
        }
         if(currWord > 0)
            {
                lastWord = currWord;
            }
        return lastWord;
    }
}