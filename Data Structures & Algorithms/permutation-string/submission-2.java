class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length() || s1.length()==0 || s2.length()==0)
        {
            return false;
        }

       

        for(int i=0; i<s2.length()-s1.length()+1;i++)
        {
            HashMap<Character, Integer> hm = new HashMap<>();
            for(int j=0;j<s1.length();j++)
            {
                char ch = s2.charAt(i+j);
                hm.put(ch, hm.getOrDefault(ch,0)+1);
            }
            for(int j=0;j<s1.length();j++)
            {
                char ch = s1.charAt(j);
                if(hm.containsKey(ch))
                {
                 hm.put(ch, hm.get(ch)-1);  
                 if(hm.get(ch)==0)
                 {
                    hm.remove(ch);
                 } 
                }
            }

            if(hm.size()==0)
            {
                return true;
            }
        }
       
        
        return false;
    }
}



// // only substring no subsequence
    // find all the permutations and store at one place --> hashset
    //using sliding window --> check if they exist in the hashset

    // public void permutations(char[] strToArr, int i, HashSet<String> perms)
    // {
    //     // find permutations

    //     if(i == strToArr.length)
    //     {
    //         System.out.println(new String(strToArr));
    //         perms.add(new String(strToArr));
    //         return;
    //     }
    //     for(int j=i;j<strToArr.length;j++)
    //     {
    //         char temp = strToArr[i];
    //         strToArr[i] = strToArr[j];
    //         strToArr[j] = temp;

    //         permutations(strToArr, i+1,perms);

    //         char temp1 = strToArr[i];
    //         strToArr[i] = strToArr[j];
    //         strToArr[j] = temp1;

    //     }

