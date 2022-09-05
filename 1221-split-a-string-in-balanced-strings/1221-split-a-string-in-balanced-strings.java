class Solution {
    public int balancedStringSplit(String s) {
        int balancedCount=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                balancedCount++;
            }
            else{
                balancedCount--;
            }
            if(balancedCount==0){
                count++;
            }
        }
        return count;
    }
}