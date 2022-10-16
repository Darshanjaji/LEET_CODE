class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] dublicate = new int[arr.length];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < arr.length;i++)
        {
            dublicate[i] = arr[i];
        }
        int count = 1;
        Arrays.sort(dublicate);

            for (int ele : dublicate) {
                if (!map.containsKey(ele)) {
                    map.put(ele,count);
                    count++;
                }
                else {
                    map.put(ele,map.get(ele));
                }
            }

        for(int j = 0;j < arr.length;j++)
        {
            arr[j] = map.get(arr[j]);
        }
        return arr;
    }
}