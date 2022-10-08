class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public void solve(int i,int[] candidates,List<Integer> temp,int target){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        if(i==candidates.length){
            return;
        }
        solve(i+1,candidates,temp,target);
        temp.add(candidates[i]);
        solve(i,candidates,temp,target-candidates[i]);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0,candidates,temp,target);
        return result;
    }
}