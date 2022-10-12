class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int i = 0;
        int j = nums.length - 1;
        while(i < nums.length - 1 && j > i)
        {
            if(odd(nums[i]))
            {
                swapp(nums,i,j);
                j--;
            }
            else {
                i++;
            }
        }
        return nums;
    }
     public boolean odd(int n)
    {
       int ans = n & 1;
        return ans == 1;
    }
    public void swapp(int[] array,int f,int e)
    {
        int temp = array[f];
        array[f] = array[e];
        array[e] = temp;
    }

}