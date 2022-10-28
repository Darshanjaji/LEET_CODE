class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder ans = new StringBuilder();
        
        int j = 0,k = 0;
        
        for(int i = 0;i < word1.length() + word2.length();i++)
        {
            if(i < word1.length())
            {
                ans.append(word1.charAt(j));
                j++;
            }
            if(i < word2.length())
            {
                ans.append(word2.charAt(k));
                    k++;
            }
        }
        return ans.toString();
    }
}