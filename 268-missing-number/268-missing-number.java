class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while( i < nums.length)
        {
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++)
        {
            if(j != nums[j])
            {
                return j;
               
            }
        }
        return nums.length;
    }
    public void swap(int[] array ,int first,int second)
    {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}