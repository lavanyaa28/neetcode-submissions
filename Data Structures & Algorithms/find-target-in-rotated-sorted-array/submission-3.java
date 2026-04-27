class Solution {

    public int pivotSearch(int[] nums)
    {
        int low=0, high=nums.length-1;

        while(low< high)
        {
            if(nums[low]<nums[high])
            {
                return low;
            }

            int mid=low+(high-low)/2;

            if(nums[mid]>nums[high])
            {
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return  low;
    }

    public int binarySearch(int low,int high, int target, int [] arr)
    {
        
        while(low <= high)
        {
            int mid= (low+high)/2;
            if(arr[mid]== target)
            {
                return mid;
            }

            else if(arr[mid] > target)
            {
                high=mid-1;
            }

            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {

        if(nums.length==0)
        {
            return -1;
        }

        int pivot = pivotSearch(nums);
        if(nums[pivot]==target)
        {
            return pivot;
        }
        int low=0, high=nums.length-1;

        System.out.println(pivot);

        

        if(nums[pivot] <= target && target <= nums[high])
        {
            return binarySearch(pivot, high, target, nums);
        }

        else{
            return binarySearch(low, pivot-1, target, nums);
        }
        
    }
}
