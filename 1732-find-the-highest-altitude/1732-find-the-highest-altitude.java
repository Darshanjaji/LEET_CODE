class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        int sum = 0;
        int pos = 1;
        for(int i=0;i<gain.length;i++){
            sum = sum+gain[i];
            arr[pos] = sum;
            pos++;
        }
        int max = -999;
        for(int j = 0;j<arr.length;j++){
            if(arr[j]>max){
                max = arr[j];
            }
        }
        return max;
    }
}