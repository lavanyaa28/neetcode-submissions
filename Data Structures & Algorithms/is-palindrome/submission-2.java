class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;

        while(i<j)
        {
            // if(Character.isDigit(s.charAt(j)) || Character.isLetter(s.charAt(j)) || Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))  )
            // {
            //     if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j)))
            //     {
            //         return false;
            //     }
            // }

            if(!Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
                continue;
            }
           else if(!Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
                continue;
            }
            else{
                if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j)))
                {
                    return false;
                }
                i++;
                j--;
                
            }
            
        }
        return true;
    }
}
