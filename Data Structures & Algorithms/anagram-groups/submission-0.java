class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            char[] sorted = strs[i].toCharArray();

            Arrays.sort(sorted);

            String str = new String(sorted);


            if(hm.containsKey(str))
            {
                ArrayList<String> arr = hm.get(str);
                arr.add(strs[i]);
                hm.put(str, arr);
            }

            else{
                ArrayList<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                hm.put(str,arr);
            }
        }

        Iterator<Map.Entry<String,ArrayList<String>>> it = hm.entrySet().iterator();

        while(it.hasNext())
        {
            Map.Entry<String, ArrayList<String>> entry = it.next();
            ArrayList<String> temp = entry.getValue();
            ans.add(temp);
            
        }

        return ans;


        
        
    }
}
