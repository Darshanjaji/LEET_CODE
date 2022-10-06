class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] array = new int[m][n];
        
        for(int i = 0; i < indices.length; i++)
        {
            int row = indices[i][0];
            for(int j = 0;j < array[0].length; j++)
            {
                array[row][j] = array[row][j] + 1;
            }
            int col = indices[i][1];
            for(int k = 0; k < array.length;k++)
            {
                array[k][col] = array[k][col] + 1;
            }
        }
        int count = 0;
        for(int p = 0;p < array.length;p++)
        {
            for(int q = 0;q < array[p].length;q++)
            {
                if(array[p][q] % 2 == 1)
                {
                    count++;
                }
            }
        }
       return count;     
    }
}