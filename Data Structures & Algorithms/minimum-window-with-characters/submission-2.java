class Solution {
    public String minWindow(String s, String t) {
        if(s.length() <t.length())
        {
            return "";
        }

        int[] freqS = new int[256];
        int[] freqT = new int[256];

        //calculate the frequency of the string 't'
        for(int i = 0 ; i<t.length(); i++)
        {
            freqT[t.charAt(i)]++;
        }

        int start = 0,count=0,mini=Integer.MAX_VALUE,minStart=0;
        
        for(int end=0;end<s.length();end++)
        {

            freqS[s.charAt(end)]++;
            if(freqT[s.charAt(end)]>0 && freqS[s.charAt(end)]<=freqT[s.charAt(end)])
            {
                count++;
            }

            if(count == t.length())
            {
                char startChar;
                while(freqS[startChar = s.charAt(start)]> freqT[startChar] ||       freqT[startChar]==0)
                {
                    if(freqS[startChar] > freqT[startChar])
                    {
                        freqS[startChar]--;
                    }
                    start++;
                }   

                int minLength = end-start+1;
                if(minLength< mini)
                {
                    mini = minLength;
                    minStart = start;
                }
            }

            
        }
        if(mini == Integer.MAX_VALUE)
        {
            return "";
        }

        return s.substring(minStart, minStart+mini);

        
    }
}
