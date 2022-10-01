class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
       // int pos = 0;
        int[] array = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            array[i] = sum;
        }
        
        
       /* for(int element : nums){
            sum = sum + element;
            array[pos] = sum;
            pos++;
        } */
        return array;
    }
}