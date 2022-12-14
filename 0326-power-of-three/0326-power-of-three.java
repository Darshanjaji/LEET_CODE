class Solution {
    public boolean isPowerOfThree(int n) {
        boolean ans = search(n,0,n / 2);
        return ans;
    }
    
    public boolean search(int n,int start,int end)
    {
        if(start > end)
        {
            return false;
        }
        int mid = start + (end - start) / 2;
        if(Math.pow(3,mid) == n)
        {
            return true;
        }
        if(Math.pow(3,mid) > n)
        {
            return search(n,start,mid - 1);
        }
        return search(n,mid + 1,end);
    }
}