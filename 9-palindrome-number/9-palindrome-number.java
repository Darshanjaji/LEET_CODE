class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0,temp,n;
        temp = x;
        while(x>0){
           int r = x % 10;
            sum = (sum * 10) + r;
            x = x / 10;
        }
        if(temp == sum){
            return true;
        }
        return false;
    }
}