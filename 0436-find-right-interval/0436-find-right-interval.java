class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] arr= new int[intervals.length];
        for(int i =0;i<intervals.length;i++){
            int a = -1;
            int min = Integer.MAX_VALUE;
            for(int j =0;j<intervals.length;j++){
                if(intervals[i][1] <= intervals[j][0]){
                    if(min > intervals[j][0]){
                        min = intervals[j][0];
                        a = j;
                    }
                }
            }
            arr[i] = a;
        }
        return arr;
    }
}