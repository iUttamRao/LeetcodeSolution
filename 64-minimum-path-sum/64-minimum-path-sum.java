class Solution {
    // static int mcp(int [][]grid,int row,int col){
    //     if(row<0 || col<0){
    //         return Integer.MAX_VALUE;
    //     }
    //     if(row==0 && col==0){
    //         return grid[row][col];
    //     }
    //    int right = mcp(grid,row,col-1);
    //    int down = mcp(grid,row-1,col);
    //    return grid[row][col] + Math.min(right,down);
    // }
    public int minPathSum(int[][] grid) {
        if( grid ==null || grid.length==0 || grid[0].length==0){
                return 0;
            }
        int matrix[][] = new int[grid.length][grid[0].length];
        matrix[0][0]=grid[0][0];
        
        for(int i=1;i<matrix.length;i++){
            matrix[i][0]=matrix[i-1][0] + grid[i][0];
        }
        for(int i=1;i<matrix[0].length;i++){
            matrix[0][i]=matrix[0][i-1] + grid[0][i];
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                int left = matrix[i][j-1];
                int up= matrix[i-1][j];
                int min=Math.min(left,up);
                matrix[i][j]=min+grid[i][j];
            }
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}