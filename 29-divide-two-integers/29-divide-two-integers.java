class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        if(dividend/divisor > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(dividend/divisor < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        else{
            return dividend/divisor;
        }
        
    }
}