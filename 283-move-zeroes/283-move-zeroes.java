class Solution {
    public void moveZeroes(int[] arr) {
        // for(int i=0;i<arr.length;i++){
        //     for(int j=1;j<arr.length;j++){
        //         if(arr[j-1]==0){
        //             int temp=arr[j-1];
        //             arr[j-1]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        
        
        
        
        
        int i=0;
        int j=0;
        while(i<arr.length && j<arr.length){
            if(arr[i]==0 && arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else if(arr[i]!=0 && arr[j]==0){
                // int temp=arr[i];
                // arr[i]=arr[j];
                // arr[j]=temp;
                i++;
            }
            else{
                // i++;
                j++;
            }
        }
    }
}