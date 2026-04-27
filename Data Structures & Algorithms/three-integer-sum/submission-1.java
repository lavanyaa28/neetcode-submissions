class Solution {


    // we choose the first element and then for the remaining element use 2 pointer approach 

    
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalAns = new ArrayList<>();
        for (int i=0;i<nums.length;i++)
        {
            if(i!=0)
            {
                if(nums[i]==nums[i-1])
                {
                    continue;
                }
            }
            int firstNum=nums[i];
            int j=i+1, k=nums.length-1;
            while (j<k)
            {
                if(nums[j]+nums[k]+firstNum==0)
                {
                    finalAns.add(Arrays.asList(firstNum, nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1])
                    {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1])
                    {
                        k--;
                    } 
                }
                else if(nums[j]+nums[k]+firstNum<0)
                {
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return finalAns;
    }
}
