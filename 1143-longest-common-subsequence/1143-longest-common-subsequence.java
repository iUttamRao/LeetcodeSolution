class Solution {
    static int tabulation(String text1,String text2,int m,int n){
        int matrix[][]=new int[m+1][n+1];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i==0 || j==0){
                    matrix[i][j]=0;
                }
                else{
                    if(text1.charAt(i-1)==text2.charAt(j-1)){
                        matrix[i][j]=matrix[i-1][j-1]+1;
                    }
                    else{
                        matrix[i][j]=Math.max(matrix[i][j-1],matrix[i-1][j]);
                    }
                }
            }
        }
        return matrix[m][n];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        
        int result =tabulation(text1,text2,m,n);
        
        return result;
    }
}