class Solution {
    public String removeStars(String s) {
        Stack<Character> stack =new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        for(int i=0;i<stack.size();i++){
            ans.append(stack.get(i));
        }
        return ans.toString();
    }
}