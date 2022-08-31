class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        int []hashset = new int[128];
        while(j<s.length()){
            char singleChar=s.charAt(j);
            hashset[singleChar]++; //hashset['a'] hashset[97]++
            while(hashset[singleChar]>1){ // character appear more than one
                char leftChar =s.charAt(i);
                hashset[leftChar]--;
                i++; //slide the window(left to right move)
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}