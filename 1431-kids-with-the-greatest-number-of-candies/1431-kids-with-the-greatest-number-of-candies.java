class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            boolean flag=true;
            for(int j=0;j<candies.length;j++){
                if(candies[i]+extraCandies<candies[j]){
                    flag=false;
                    break;
                }
            }
            ans.add(flag);
        }
        return ans;
    }
}