class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int majorityElement=0;
        int majCount=nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                majorityElement=nums[i];
            }
            if(majorityElement==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int ele:nums){
            if(ele==majorityElement){
                count++;
            }
        }
        if(count>majCount){
            return majorityElement;
        }
        return 0;
        
    }
}