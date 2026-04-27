class Solution {
    public int appendCharacters(String s, String t) {
        if(s.length()==0){return 0;}
        if(t.length()==0){return s.length();}

        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(j);
            if(c1==c2)
            {
                j++;
                if(j==t.length())
                {
                    return 0;
                }
            }


        }

        return (t.length()-j);
    }
}