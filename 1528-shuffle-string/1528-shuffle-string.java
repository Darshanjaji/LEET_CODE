class Solution {
    public String restoreString(String s, int[] indices) {
        char[] charArray = new char[indices.length];
		
        for(int i=0;i<indices.length;i++){
            charArray[indices[i]] = s.charAt(i);
        }
        return new String(charArray);
    }
}