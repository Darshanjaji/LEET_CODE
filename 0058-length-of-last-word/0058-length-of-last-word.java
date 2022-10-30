class Solution {
    public int lengthOfLastWord(String s) {
     int ans =  s.split(" ")[s.split(" ").length - 1].length();
        return ans;
    }
}