class Solution {
    public boolean checkPossibility(int[] nums) {
        //int count=0;
        //int j=0;
        //if()
        boolean flag=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                continue;
            }
            if(flag){
                return false;
            }
            if(i==0 || (nums[i+1]>=nums[i-1])){
                nums[i]=nums[i+1];
                flag=true;
            }
            else{
                nums[i+1]=nums[i];
                flag=true;
            }
        }
        return true;
    }
}