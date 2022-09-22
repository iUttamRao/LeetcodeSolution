class Solution {
    public double angleClock(int hour, int minutes) {
        
        double hourDeg = (hour * 30) + (minutes * 0.5); // hour_hand --> 30° per hour and 1/2° per minute
        double minuteDeg = (hour * 0) + (minutes * 6); // minute hand --> 0° per hour and 6° per minute
        
        double angle =Math.abs(hourDeg-minuteDeg);
        
        // There are two Possible angle between hour hand and minute hand
        //Min method used to find min angle 
        return Math.min(angle,360-angle); 
    }
}