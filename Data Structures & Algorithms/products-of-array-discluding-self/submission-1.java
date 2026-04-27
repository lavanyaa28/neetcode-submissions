class Solution {
    // public int[] productExceptSelf(int[] nums) {
    //     int[] product=new int[nums.length];
        
    //         int prod=1;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         for(int j=0;j<nums.length;j++)
    //         {
    //             if(i!=j)
    //             {
    //                 prod*=nums[j];
    //             }
    //         }
    //         product[i]=prod;
    //         prod=1;
    //     }
    //     return product;
    // }
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct=new int[nums.length];
        int[] rightProduct=new int[nums.length];
        int[] finalProduct=new int[nums.length];
        leftProduct[0]=1;
        rightProduct[nums.length-1]=1;

        for(int i=1;i<nums.length;i++)
        {
            leftProduct[i]=leftProduct[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            rightProduct[i]=rightProduct[i+1]*nums[i+1];
        }

        for(int i=0;i<nums.length;i++)
        {
            finalProduct[i]=leftProduct[i]*rightProduct[i];
        }
        return finalProduct;
    }
}  
