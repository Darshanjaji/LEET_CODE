/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
         int start = 1;
        int end = n;
        while(start<=end){
            int ver =(int)(start + (end-start)/2);
            if(isBadVersion(ver))
                end = ver - 1;
            else
                start = ver + 1;
        }
        return start;
    }
}