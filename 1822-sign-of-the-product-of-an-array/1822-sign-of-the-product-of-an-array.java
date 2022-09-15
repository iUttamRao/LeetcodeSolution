class Solution {
    public int arraySign(int[] nums) {
        //int product=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            //product*=nums[i];
            if(nums[i]==0){
                return 0;
            }
            else if(nums[i]<0){
                count++;
            }
        }
        if(count%2==0){
            return 1;
        }
        else{
            return -1;
        }
    }
}