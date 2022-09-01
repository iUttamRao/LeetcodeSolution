class Solution {
    public boolean isPalindrome(int x) {
        boolean flag=false;
        for (int i=0; i< String.valueOf(x).length() ; i ++ ){
            if(String.valueOf(x).charAt(i)==String.valueOf(x).charAt((String.valueOf(x).length()-1)-i)){
                flag=true;
            }
            else{
                return false;
            }
        }
        return flag;
    }
}