class Solution {
    public List<Integer> luckyNumbers (int[][] arr) {
        ArrayList<Integer> res =new ArrayList<>();
        ArrayList<Integer> minInRow =new ArrayList<>();
        ArrayList<Integer> maxInCol =new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        //Row Major Order
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                min =Math.min(min,arr[i][j]);
            }
            minInRow.add(min);
            min=Integer.MAX_VALUE;
        }

        //Column Major Order
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                max =Math.max(max,arr[j][i]);
            }
            maxInCol.add(max);
            max=Integer.MIN_VALUE;
        }
        // Compare min in row and max in col
        for(int m : minInRow){
            if(maxInCol.contains(m)){
                res.add(m);
            }
        }
        return res;
    }
}