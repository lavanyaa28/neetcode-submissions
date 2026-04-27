class Solution {
    public void recCall(int[] nums, int target, int i, List<List<Integer>> ans, List<Integer> temp)
    {
        if(i== nums.length)
        {
            return;
        }
        if(target == 0)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(target >= nums[i] )
        {
            temp.add(nums[i]);
            recCall(nums, target-nums[i], i, ans,temp );
            temp.remove(temp.size()-1);
        }

        recCall(nums, target, i+1, ans, temp);


    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        recCall(nums, target, 0, ans, temp);
        return ans;
        
        
    }
}
