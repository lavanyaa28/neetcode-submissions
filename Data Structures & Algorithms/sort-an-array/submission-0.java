class Solution {
    public int[] merge(int[] nums, int low, int mid,int high){
        int n = high-low+1;
        int[] merge = new int [n];

        int i=low, j=mid+1, k=0;

        while(i<=mid && j<=high)
        {
            if(nums[i] < nums[j])
            {
                merge[k++] = nums[i++];
            }
            else{
                merge[k++] = nums[j++];
            }
        }

        while(i<=mid )
        {
            
            merge[k++] = nums[i++];
            
        }

         while(j<=high)
        {
            
            merge[k++] = nums[j++];
            
        }

        for(i=0;i<n;i++)
        {
            nums[low+i] = merge[i];
        }

        return nums;
    }
    public void mergeSort(int[] nums, int low, int high){
        
       if(low>=high)
       {
        return;
       }
       {
        int mid = low + ((high-low)/2);
        mergeSort(nums,low, mid);
        mergeSort(nums, mid+1,high);
        merge(nums, low, mid, high);
       }

    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
        
    }
}