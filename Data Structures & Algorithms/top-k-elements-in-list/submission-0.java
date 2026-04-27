class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }    

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (entry1, entry2) -> entry2.getValue() - entry1.getValue() 
        );    

        pq.addAll(hm.entrySet());

        int[] result=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=pq.poll().getKey();
        }
        return result;
    }
}
