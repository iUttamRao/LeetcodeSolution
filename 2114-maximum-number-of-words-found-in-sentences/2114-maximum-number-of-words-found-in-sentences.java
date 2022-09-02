class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(String s:sentences){
            int count=s.length() -s.replace(" ","").length();
            max=Math.max(max,count);
        }
        return max+1;
    }
}