class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char singleChar =s.charAt(i);
            // if it is closing stack pop
            if(map.containsKey(singleChar)){
                if(stack.empty()){
                    return false;
                }
                else{
                    char topValue=stack.pop();
                    if(topValue!=map.get(singleChar)){
                        return false;
                    }
                }
                
            }
            else{
                //if it is opening,push in stack
                stack.push(singleChar);
            }
        }
        return stack.isEmpty();
    }
}