class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] ans = findexactarr(matrix,target);
        int low = 0;
        int high = n-1;
        if (ans == null) return false;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(ans[mid]==target){
                return true;
            }
            else if(ans[mid]>target){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
    public int[] findexactarr(int[][] matrix,int target){
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0 ; i < m ; i++){
            if(matrix[i][0]<=target && matrix[i][n-1]>=target){
                return matrix[i];
                
            }
        }
        return null;
    }
}