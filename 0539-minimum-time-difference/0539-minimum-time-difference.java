class Solution {
    public int findMinDifference(List<String> timePoints) {
        int arr[] = new int[timePoints.size()];
        for(int i =0;i<timePoints.size();i++){
            String str = timePoints.get(i);
            int sum1 = (str.charAt(0)-'0')*10+str.charAt(1)-'0';
            int sum2 = (str.charAt(3)-'0')*10+str.charAt(4)-'0';
            arr[i] = sum1*60+sum2;
        }
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i =0;i<arr.length-1;i++){
            min = Math.min(min,arr[i+1]-arr[i]);
        }
        min = Math.min(min,1440-arr[arr.length-1]+arr[0]);
        return min;
    }
}