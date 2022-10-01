class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashSet<Integer> set1 = new HashSet<>();
           HashSet<Integer> set2 = new HashSet<>();
      
        for(int i =0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
          for(int i =0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }
        set1.retainAll(set2);//set1 intersection set2 and result in set1
        int[] ans = new int[set1.size()];

        int i = 0;
           for(int j : set1) {
    ans[i++] = j;
}
        
        return ans;
    }
}