class Solution {
    // static void swap(int arr[],int i,int j){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    // }
    public int[] pivotArray(int[] nums, int pivot) {
        int temp[] = new int[nums.length];
           int k = 0;
           for(int i = 0;i< nums.length;i++){
               if(nums[i]<pivot){
                   temp[k] = nums[i];
                   k++;
               }
           }
        for(int i = 0;i< nums.length;i++){
            if(nums[i]==pivot){
                temp[k] = nums[i];
                k++;
            }
        }
        for(int i = 0;i< nums.length;i++){
            if(nums[i]>pivot){
                temp[k] = nums[i];
                k++;
            }
        }
        return temp;
        
        // int low=0;
        // int mid=0;
        // int high=nums.length-1;
        // while(mid<high){
        //     if(nums[mid]<pivot){
        //         swap(nums,low,high);
        //         low++;
        //         mid++;
        //     }
        //     else if(nums[mid]>pivot){
        //         swap(nums,high,mid);
        //         high--;
        //     }
        //     else{
        //         mid++;
        //     }
        // }
        // return nums;
    }
}