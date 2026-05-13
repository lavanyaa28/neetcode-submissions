class Solution {
    public void fillColors(int[] nums, int[] colors)
    {
        int i=0, j=0;
        while(i<colors.length)
        {
            if(colors[i]==0)
            {
                i++;
                continue;
            }
            nums[j] = i;
            colors[i]--;
            
            j++;

            
        }

        for(i=0;i<nums.length;i++)
        {
           System.out.print(nums[i]);
        }
    }
    public int[] countColors(int[] nums)
    {
        int[] colors = new int[3];

        for(int i=0;i<nums.length;i++)
        {
            int c = nums[i];
            colors[c]++;
        }

        for(int i=0;i<colors.length;i++)
        {
           System.out.print(colors[i]);
        }
        System.out.println();

        return colors;
    }
    public void sortColors(int[] nums) {

        if(nums.length<=1)
        {
            return;
        }
        int[] colors = countColors(nums);
        fillColors(nums,colors);      
        
    }
}