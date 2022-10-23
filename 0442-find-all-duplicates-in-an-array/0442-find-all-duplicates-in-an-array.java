class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
         
       int i = 0;
        while(i < nums.length)
        {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct])
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }
        for(int j = 0;j < nums.length;j++)
        {
            if(nums[j] != j + 1)
            {
                ans.add(nums[j]);
            }
        }
        return ans;
    }
    public void swap(int[] array,int first,int secound)
    {
        int temp = array[first];
        array[first] = array[secound];
        array[secound] = temp;
    }
}