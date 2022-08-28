class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
         int n = gas.length;
        int index = 0;
        int minSpace = Integer.MAX_VALUE;
        int spare = 0;
        
        for (int i = 0; i < n; i++){
            spare += gas[i] - cost[i];
            
            if(spare < minSpace){
                index = i;
                minSpace = spare;
            }
        }
        
        return spare < 0 ? -1 : (index + 1) % n; 
        
    }
}