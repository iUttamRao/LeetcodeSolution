class Solution {
    public int[] twoSum(int[] arr, int sum) {
        int [] indexes = new int[2];
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key = sum-arr[i];

            if(map.get(arr[i])==null){ //This key is not present
                map.put(key,i); //put that key in hashmap
            }
            else{// u found the key
                indexes[0]= map.get(arr[i]);
                indexes[1]= i;
               // System.out.println("Pair found "+map.get(arr[i])+ " current index "+i);
            }
            
        }
        return indexes;
    }
}