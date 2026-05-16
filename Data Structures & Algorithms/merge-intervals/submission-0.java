class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        int start=intervals[0][0];
        int end = intervals[0][1];

        ArrayList<int[]> ans = new ArrayList<>();

        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0] <= end)
            {
                end = Math.max(end, intervals[i][1]);
                System.out.println(i + " end updated");
            }

            else{
                ans.add(new int[]{start,end});

                start = intervals[i][0];
                end = intervals[i][1];
                System.out.println(i + " start and end updated");
            }
        }

        ans.add(new int[]{start,end});

        return ans.toArray(new int[ans.size()][]); 
        
    }
}
