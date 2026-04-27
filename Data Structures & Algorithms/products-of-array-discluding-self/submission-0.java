class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product=new int[nums.length];
        
            int prod=1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    prod*=nums[j];
                }
            }
            product[i]=prod;
            prod=1;
        }
        return product;
    }
}  
