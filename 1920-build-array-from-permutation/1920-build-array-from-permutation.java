class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                continue;
            }
            if(nums[i]<=nums.length){
            arr[i] = nums[nums[i]];
            }
        }
       return arr;
    }
}