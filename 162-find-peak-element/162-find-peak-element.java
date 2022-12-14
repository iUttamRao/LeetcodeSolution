class Solution {
    public int findPeakElement(int[] arr) { 
        int n = arr.length;
        int low=0;
        int high=arr.length-1;
        if(n==1){
            //System.out.println(arr[0]);
            return 0;
        }
        while(low<=high){
            
            int mid=(low+high)/2;
            if(mid>0 && mid<n-1){
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                   // System.out.println(arr[mid]);
                    return mid;
                }
                else if(arr[mid-1]>arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(mid==0){
                if(arr[0]>arr[1]){
                    //System.out.println(arr[0]);
                    return 0;
                }
                else{
                    //System.out.println(arr[1]);
                    return 1;
                }
            }
            else if(mid==n-1){
                if(arr[n-1]>arr[n-2]){
                   // System.out.println(arr[n-1]);
                    return n-1;
                }
                else{
                   // System.out.println(arr[n-2]);
                    return n-2;
                }
            }
        }
        return 0;
    }
}