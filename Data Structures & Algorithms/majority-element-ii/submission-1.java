class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1,greatestCount=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else{
                if(count > (float)nums.length/3)
                {
                    arr.add(nums[i-1]);
                }
                count=1;
            }
        }

        if((float)count > (float)nums.length/3)
        {
            arr.add(nums[nums.length-1]);
        }

        return arr;
       
        
    }
}