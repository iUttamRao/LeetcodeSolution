class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[j]==val){
                j--;
            }
            if(nums[i]==val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
            }
            else{
                i++;
            }
            }
        int count=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=val){
                count++;
            }
        }
        return count;
    }
 }