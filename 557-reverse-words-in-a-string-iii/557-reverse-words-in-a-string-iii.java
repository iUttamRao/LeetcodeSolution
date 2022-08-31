class Solution {
    public String reverseWords(String s) {
        String res="";
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++){
             StringBuilder sb = new StringBuilder();
             sb.append(str[i]);
             sb.reverse();
             if(i<str.length-1){
                 res =res+ sb+" ";
             }
             else{
                 res=res+sb;
             }
             
             sb.delete(0,str[i].length()-1);
        }
        return res;
    }
}