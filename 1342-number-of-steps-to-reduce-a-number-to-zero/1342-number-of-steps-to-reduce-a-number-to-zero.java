class Solution {
    public int numberOfSteps(int num) {
        int ans = reduce(num,0);
        return ans;
    }
    public int reduce(int num,int steps)
    {
        if(num == 0)
        {
            return steps;
        }
        if(num % 2 == 0)
        {
          return  reduce(num / 2,steps + 1);
        }
        
        return  reduce(num - 1,steps + 1);
    }
}