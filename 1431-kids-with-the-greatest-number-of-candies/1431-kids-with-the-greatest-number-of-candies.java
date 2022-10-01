class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
       List<Boolean> array = new ArrayList<Boolean>(candies.length);
        int sum = 0;
        int pos = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int ele : candies){
            sum = sum+ele+extraCandies;
            if(sum >= max){
                 array.add(true);
            }
            else{
                array.add(false);
            }
           
            pos++;
            sum = 0;
            
        }
        return array;
        
    }
}