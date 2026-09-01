class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        int l=0;
        int r=n-1;

        while(l < m && r >= 0){
            int current=matrix[l][r];
            if(current==target){
                return true;
            }else if(current>target){
                r--;
            }else{
                l++;
            }
        }
        return false;
    }
}