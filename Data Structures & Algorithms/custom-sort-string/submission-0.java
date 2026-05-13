class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }


        StringBuilder sb = new StringBuilder();

        for(int i=0;i<order.length();i++)
        {
            char ch = order.charAt(i);
            if(hm.containsKey(ch))
            {
                int count = hm.get(ch);
                for(int j=0;j<count; j++)
                {
                    sb.append(ch);
                }

                hm.remove(ch);
            }
        }

       Iterator<Map.Entry<Character, Integer>> it = hm.entrySet().iterator();

while (it.hasNext()) {

    Map.Entry<Character, Integer> entry = it.next();

    char ch = entry.getKey();
    int count = entry.getValue();

    for (int j = 0; j < count; j++) {
        sb.append(ch);
    }

    // Correct removal
    it.remove();
}

        return sb.toString();
        
    }
}