class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[temperatures.length];
        // int maxVal = Integer.MIN_VALUE;
        for(int i=0;i<temperatures.length;i++)
        {
           while(!s.isEmpty() && temperatures[s.peek()]<temperatures[i])
           {
                res[s.peek()] = i-s.peek();
                s.pop();
           }
           s.push(i);
        }

        return res;
        
    }
}
