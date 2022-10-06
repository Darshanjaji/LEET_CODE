class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int r = mat.length;
        for(int i = 0; i < r; i++){
            sum = mat[i][i]  + sum;
            sum = sum + mat[i][r - i -1];
        }
        if(r % 2 == 1){
            sum = sum - mat[r/2][r/2];
        }
        return sum;
    }
}