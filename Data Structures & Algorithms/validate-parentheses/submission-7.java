class Solution {
    public boolean isValid(String s) {
        boolean k=true;
        if((s.length() % 2)!=0)
        {
            return false;
        }
        if(s.charAt(0)==']' || s.charAt(0)=='}' || s.charAt(0)==')' )
        {
            return false;
        }

        // if(s.charAt(s.length()-1)=='(' || s.charAt(s.length()-1)=='{' || s.charAt(s.length()-1)=='[')
        // {
        //     return false;
        // }

        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' ||  s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }

            else{
                if(!st.isEmpty())
                {
                    if((s.charAt(i)==']' && st.peek()=='[') ||(s.charAt(i)==')' && st.peek()=='(')
                        ||(s.charAt(i)=='}' && st.peek()=='{'))
                    {
                        st.pop();
                    }
                     else{
                        return false;
                    }
                }
                 else{
                        return false;
                    }
                
            }
        }
        if(!st.isEmpty())
        {
         return false;
        }
        return true;
    }
}