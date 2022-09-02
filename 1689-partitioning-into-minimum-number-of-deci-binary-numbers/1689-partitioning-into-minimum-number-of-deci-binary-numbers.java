class Solution {
    public int minPartitions(String n) {
        int sum=0;
        for(int i=0;i<n.length();i++){
            sum=Math.max(sum,Integer.valueOf(n.charAt(i) - '0'));
        }
        return sum;
    }
}