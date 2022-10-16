class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;
        for( int i = 0; i < seats.length; i++){
            if(seats[i] < students[i]){
                sum = sum + students[i] - seats[i];
            }
            else{
                sum = sum + seats[i] -students[i];
            }
        }
        return sum;
    }
    
}