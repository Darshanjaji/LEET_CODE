class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] array = new int[accounts.length];
        int sum = 0;
        for(int row=0;row<accounts.length;row++){ 
            for(int col = 0; col<accounts[row].length;col++){
                sum = sum + accounts[row][col];
            }
            array[row] = sum;
            sum = 0;
        }
      int max = array[0];
        for(int i=0;i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}