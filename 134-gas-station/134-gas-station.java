class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length==0){
		return -1;
	    }
			   	
        if(gas.length==1){
            return gas[0]-cost[0]<0?-1:0;
        }
        int start = 0;
	    int end = 1;
        int curr= gas[0]-cost[0];
        while(start!=end) {
	     while(curr<0 && start!=end) {
		 curr= curr- (gas[start]-cost[start]);
		 start = (start+1)%gas.length;
		 if(start==0)
		    return -1;
	      }
	     curr+= gas[end]-cost[end];
	     end = (end+1)%gas.length;
	 }
	   if(curr<0)
	      return -1;
	   return start;
        
    }
}