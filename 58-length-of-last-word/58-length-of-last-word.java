class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        s = s.replaceAll("[ ]+", " ");
        String arr[]=s.split(" ");
        String res=arr[arr.length -1];
       // System.out.println(res);
        return res.length();
    }
}