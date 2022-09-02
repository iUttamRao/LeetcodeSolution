class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].charAt(0)=='-'){
                ans-=1;
            }
            else if(operations[i].charAt(0)=='X' && operations[i].charAt(1)=='+'){
                ans+=1;
            }
            else if(operations[i].charAt(0)=='X' && operations[i].charAt(1)=='-'){
                ans-=1;
            }
            else{
                ans+=1;
            }
        }
        return ans;
    }
}