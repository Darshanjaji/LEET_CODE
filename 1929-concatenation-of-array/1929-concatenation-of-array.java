class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length*2;
        int[] arr = new int[length];
        int pos=0;
        int pos2 = nums.length;
       for(int elements :  nums){
           arr[pos] = elements;
           arr[pos2]=elements;
           pos++;
           pos2++;
       }
       
        return arr;
    }
}