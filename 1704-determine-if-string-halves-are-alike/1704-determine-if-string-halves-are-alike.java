class Solution {
    public boolean halvesAreAlike(String s) {
      char[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
        int count1 = 0,count2 = 0;
         
        for(int i = 0;i < s.length() / 2;i++)
        {
            for(int j = 0;j < vowel.length;j++)
            {
                if(s.charAt(i) == vowel[j]){
                    count1++;
                }
            }
        }
        for(int n = s.length() / 2;n < s.length(); n++)
        {
            for(int m = 0;m < vowel.length;m++)
            {
                if(s.charAt(n) == vowel[m])
                {
                    count2++;
                }
            }
        }
        return count1 == count2;
    }
}