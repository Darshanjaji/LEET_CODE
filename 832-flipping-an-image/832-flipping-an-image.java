class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] array : image)
       {
         rev(array);  
       }
        for(int i = 0; i < image.length; i++)
        {
            for(int j = 0 ; j < image[i].length; j++)
            {
                image[i][j] = inevert(image[i][j]);
            }
        }
     return image;   
    }
    public void rev(int[] nums)
    {
        int i = 0,j = nums.length - 1;
        while(i <= nums.length / 2 && j >= nums.length / 2)
        {
            swap(nums,i,j);
            i++;
           j--;
        }
    }
    public void  swap(int[] a,int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public int inevert(int ele)
    {
        if(ele == 0)
        {
           return 1;
        }
     return 0;
    }
}