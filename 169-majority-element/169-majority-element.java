class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;
        int majorityelement=-1;
        int count=0;
        
        for(int i=0; i<n; i++){
            if(majorityelement==nums[i]){
            count++;
            }
            else if(count==0){
                majorityelement=nums[i];
                    count++;
            }
            else{
                count--;
            }
        }
        
        return majorityelement;
    }
}