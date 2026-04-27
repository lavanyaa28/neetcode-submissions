class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            String str = tokens[i];

            if(str.equals("+"))
            {
                int one = st.peek();
                st.pop();
                int two = st.peek();
                st.pop();
                st.push(one + two);
            }

            else if(str.equals("-"))
            {
                int one = st.peek();
                st.pop();
                int two = st.peek();
                st.pop();
                st.push(two-one);
            }

            else if(str.equals("*"))
            {
                int one = st.peek();
                st.pop();
                int two = st.peek();
                st.pop();
                st.push(two*one);
            }

             else if(str.equals("/"))
            {
                int one = st.peek();
                st.pop();
                int two = st.peek();
                st.pop();
                st.push(two/one);
            }
            else{
                int n = Integer.parseInt(str);
                st.push(n);
            }

            // str.equals("*") || str.equals("/")

        }

        return st.peek();
        
    }
}
