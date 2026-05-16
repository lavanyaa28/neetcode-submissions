class Solution {

    public void reverse(int[] nums, int i, int j)
    {
        while(i<j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        // rotate whole array
        // reverse(nums,0,nums.length-1);
        // rotate k elements
        // reverse(nums,0,nums.length-1-k);
        // rotate the rest of the array
        // reverse(nums,nums.length-k,nums.length-1);

        k = k % nums.length;

        
        reverse(nums, 0 , nums.length-1);
        
        reverse(nums,0,k-1 );

        reverse(nums,k, nums.length-1);

    }
}