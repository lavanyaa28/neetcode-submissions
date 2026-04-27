class Solution {

    public void recCall(int[] nums,List<List<Integer>> ans, List<Integer> subs, int i)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(subs));
            return;
        }
        
        subs.add(nums[i]);
        recCall(nums, ans, subs, i+1);
        subs.remove(subs.size()-1);
        recCall(nums, ans, subs, i+1);
        
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subs = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        recCall(nums, ans, subs,0);
        return ans; 
    }
}
