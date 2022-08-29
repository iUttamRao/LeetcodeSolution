class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp=0;
            temp=nums[i]*nums[i];
            ans[i]=temp;
        }
        Arrays.sort(ans);
        return ans;
    }
}