class Solution {
    public int heightChecker(int[] heights) {
        int[] array = new int[heights.length];
        for(int i = 0;i < heights.length;i++)
        {
            array[i] = heights[i];
        }
        Arrays.sort(array);
        int j = 0,k = 0;
        int count = 0;
        while(j < array.length && k < array.length)
        {
            if(heights[j] != array[k])
            {
                count++;
                j++;
                k++;
            }
            else{
                j++;
                k++;
            }
        }
        return count;
    }
}