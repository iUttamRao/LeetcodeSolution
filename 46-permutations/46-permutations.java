class Solution {
    public void isValid(List<List<Integer>> res,int nums[],List<Integer> curr,boolean[] visited){
        if(curr.size()==nums.length){  // if new combination is equal to the length of the nums Array length
            res.add(new ArrayList(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==true){ // if integer is visited already then skip  
                continue;
            }
            curr.add(nums[i]); // add integer to the combination if not visited
            visited[i]=true; // then mark it as visited
            isValid(res,nums,curr,visited); // then call the isValid function
            curr.remove(curr.size()-1); //remove last element
            visited[i]=false; // and mark it as false again (backtrack)
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean visited[] = new boolean[nums.length];
        isValid(res,nums,new ArrayList(),visited);
        return res;
    }
}