class Solution {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public void sortColors(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(mid<=high){
            switch(arr[mid]){
                case 0:
                    swap(arr,mid,low);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,high);
                    high--;
                    break;
            }
        }
    }
}