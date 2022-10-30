class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length - 1);
    }
    public void reverse(char[] s,int start,int end)
    {
        if(start > end)
        {
           return ;
        }
        swap(s,start,end);
        reverse(s,start + 1,end - 1);
    }
    public void swap(char[] array,int start,int end)
    {
        char temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
}