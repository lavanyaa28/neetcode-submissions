class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        {return true;}
        if(t.length()==0)
        {return false;}
        int j=0; 
        for(int i=0;i<t.length();i++)
        {
           char c1=t.charAt(i);
           char c2=s.charAt(j);

           if(c1==c2)
           {
            System.out.println(c1);
            j++;
            if(j==s.length()){
                return true;
            }
           }

        }
        System.out.println(j);

        if(j>s.length()){
            return true;
        }
        return false;
    }
}