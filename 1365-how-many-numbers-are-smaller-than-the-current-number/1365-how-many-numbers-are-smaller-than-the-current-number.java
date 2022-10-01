class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array = new int[nums.length];
        int count = 0;
        int pos = 0;
        for(int ele : nums){
            for(int i = 0;i< nums.length;i++){
              if(ele>nums[i]){
                  count++;
              }   
        }
            array[pos] = count;
            count = 0;
            pos++;
        }
        return array;
    }
}