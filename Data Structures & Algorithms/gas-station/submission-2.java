class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0, totalCost=0;
        for(int i=0;i<gas.length;i++)
        {
            totalGas+=gas[i];
            totalCost+=cost[i];
        }
        if(totalGas < totalCost)
        {
            return -1;
        }

        int currCap=0, totalCap=0;
        int startStation=0;


        for(int i=0;i<gas.length;i++)
        {   
            currCap+=gas[i]-cost[i];
            totalCap+=gas[i]-cost[i];

            if(currCap < 0)
            {
                startStation=i+1;
                currCap = 0;
            }
        }

        return startStation;
    }
}
