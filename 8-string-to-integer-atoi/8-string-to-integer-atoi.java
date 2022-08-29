class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int sign=1; // Positive
        int index=0;
        int r=0;
        //e.g "     987"
        while(index<n && s.charAt(index)==' '){
            index++;
        }
        //Identify the sign(+/-) +987 or -987
        if(index<n && s.charAt(index)=='+'){
            sign=1;
            index++;
        }
        else{
            if(index<n && s.charAt(index)=='-'){
                sign=-1;
                index++;
            }
        }
        //pick only digit, stop when character found
        while(index<n && Character.isDigit(s.charAt(index))){
            int digit=s.charAt(index) - '0';
            if(r>Integer.MAX_VALUE/10 ||(r==Integer.MAX_VALUE/10) && digit>Integer.MAX_VALUE%10){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            r=10*r+digit;
            index++; // move to next digit;
        }
        return r*sign;
    }
}