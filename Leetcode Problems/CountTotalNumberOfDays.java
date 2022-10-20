class Solution
{
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob)
    {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        String arrival, departure; // ar is the latest arrival date, dp is the earliest departure date
        
        arrival = arriveAlice.compareTo(arriveBob) <= 0 ? arriveBob : arriveAlice;
        
        depature = leaveAlice.compareTo(leaveBob) <= 0 ? leaveAlice : leaveBob;
        
        int ret = 1;
        
        if(arrival.compareTo(departure) > 0) // ar is later than dp
            return 0;

        int a = Integer.parseInt(ar.substring(0,2)), d = Integer.parseInt(dp.substring(0,2)), add = Integer.parseInt(ar.substring(3)), ddd = Integer.parseInt(dp.substring(3));
        // Month and day separated for arr and dp values
		
        for(int i = a+1; i < d; i++)
            ret += days[i]; // Days of months between arrival and departure(exclusive)
        
        if(a == d) // If arrival and departure in the same month, day difference is departure - arrival
            ret += (ddd-add);
        
        else // If arrival and departure in different months, day difference is number of days remaining in the arrival month + departure date
        {
            ret += days[a]-add;
            ret += d;
        }
        
        return ret;
    }
}