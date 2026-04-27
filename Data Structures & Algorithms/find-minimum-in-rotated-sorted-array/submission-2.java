class Solution {
    // public int binarySearch(int low,int high, int[] nums)
    // {
        
    // }
    public int findMin(int[] nums) {
        int pivot=-1;
        int low=0; int high=nums.length-1;
        while(low<high)
        {
            if(nums[low]<nums[high])
            {
                return nums[low];
            }

            int mid=(high+low)/2;

            if(nums[mid]>nums[high])
            {
                low=mid+1;
                System.out.println("mid greater than high found");
            }

            else{
                System.out.println("low found");
                high=mid;
            }
        }
        return nums[low];
    }
}
