class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if(hand.length % groupSize != 0)
        {
            return false;
        }
        int maxValue=0;
        for(int i=0;i<hand.length;i++)
        {
            maxValue=Math.max(maxValue, hand[i]);
        }

        int[] boolArr = new int[maxValue+1];

        for(int i=0;i<hand.length;i++)
        {
            boolArr[hand[i]]++;
        }

        for(int i=0;i <= maxValue ; i++)
        {
            while (boolArr[i] > 0) {
                if(boolArr[i]==0)
                {
                    continue;
                }

                for(int j=0 ; j < groupSize ; j++)
                {
                    if(i+j > maxValue)
                    {
                        return false;
                    }
                    if(boolArr[i+j]==0)
                    {
                        return false;
                    }

                    boolArr[i+j]--;
                }
            }
        }   

        for (int i=0;i<=maxValue ; i++)
        {
            if(boolArr[i]!=0)
            {
                return false;
            }
        }

        return true;
        
    }
}
