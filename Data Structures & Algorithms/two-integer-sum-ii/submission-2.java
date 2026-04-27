class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i=0, j=numbers.length-1;
        int[] setInt=new int[]{-1,-1};
        while(i<j)
        {   
            if(numbers[i]+numbers[j]==target)
            {
                setInt[0]=i+1;
                setInt[1]=j+1;
                break;
            }

            else if(numbers[i]+numbers[j]<target)
            {
                i++;
            }
            else{
                j--;
            }

            
        }

        return setInt;
        
    }
}
