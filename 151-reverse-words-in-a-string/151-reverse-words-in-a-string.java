class Solution {
    public String reverseWords(String s) {
        String res="";
        String ans=s.trim();
        ans= ans.replaceAll("\\s+", " ");
        String arr[]=ans.split(" ");
        for(int i=0;i<arr.length;i++){
            if (i == arr.length - 1){
                res = arr[i] + res;
            }
            else{
                res = " " + arr[i] + res;
            }
          // System.out.print(arr[i]+" ");
        }
        return res;
    }
}