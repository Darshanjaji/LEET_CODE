class Solution {
    public int findNumbers(int[] nums) {
        int even_count = 0;
        for(int i = 0;i < nums.length;i++)
        {
            if(count(nums[i]) % 2 == 0)
            {
                even_count++;
            }
        }
       return even_count;
     
     }
    public int count(int n)
     {
         int counter = 0;
         while(n != 0)
         {
             n = n / 10;
             ++counter;
         }
         return counter;
    }
}