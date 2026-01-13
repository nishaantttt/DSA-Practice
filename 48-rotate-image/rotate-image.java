class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int nm[][] = new int[n][n];
        for (int i=0 ; i<matrix.length ; i++){
           for (int j=0 ; j<matrix.length ; j++){
            nm[i][j]=matrix[j][i];
           }
        }
        for (int i=0 ; i<matrix.length ; i++){
           for (int j=0 ; j<matrix.length ; j++){
            matrix[i][j]=nm[i][j];
           }
        }
        
        for (int i=0 ; i<matrix.length ; i++){
            int rev=0;
           for (int j=matrix.length-1 ; j>=0 ; j--){
            nm[i][rev]=matrix[i][j];
            rev++;
           }
        }
        for (int i=0 ; i<matrix.length ; i++){
           for (int j=0 ; j<matrix.length ; j++){
            matrix[i][j]=nm[i][j];
           }
        }
        
        
    }
}