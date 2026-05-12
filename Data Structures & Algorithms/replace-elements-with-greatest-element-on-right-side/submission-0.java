class Solution {
    public int[] replaceElements(int[] arr) {
        int[] greatest = new int[arr.length];
        greatest[arr.length-1] = -1;
        for(int i = arr.length-2; i>=0;i--)
        {
            greatest[i] = arr[i+1]>greatest[i+1] ? arr[i+1] : greatest[i+1];

        }
        
        return greatest;
    }
}