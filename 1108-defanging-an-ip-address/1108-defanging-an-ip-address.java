class Solution {
    public String defangIPaddr(String address) {
        String res=address;
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                res=address.replace(".","[.]");
            }
        }
        return res;
    }
}