class Solution {
    public void sortColors(int[] nums) {
       int x = 0 ; int y = 0 ; int z = 0 ;
        
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] == 0){
                x++;
            }else if(nums[i] == 1){
                y++ ;
            }else{
                z++ ;
            }
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(x>0){
                nums[i] = 0 ;
                x--;
            }else if(x== 0 && y > 0){
                nums[i] = 1 ;
                y--;
            }else if(x==0 && y==0 && z>0){
                nums[i] = 2 ;
            }
        }
    }
}