class Solution {
    public int singleNumber(int[] nums) {
        // x ^ x =0
        // x ^ 0 =x
        int res=0;
        for(int i=0;i<nums.length;i++){
            res^=nums[i];
        }
        return res;
    }
}