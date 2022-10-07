class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean inc = false;
        boolean dec = false;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i])
                inc = true;
            else if(nums[i-1]>nums[i])
                dec = true;
            if(inc && dec)
                return false;
        }
        return true;
    }
}