class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        lst.add(intervals[0][0]);
        int max = intervals[0][1];
        for(int i =0;i<intervals.length-1;i++){
            if(max < intervals[i+1][0]){
                lst.add(max);
                list.add(lst);
                lst = new ArrayList<>();
                lst.add(intervals[i+1][0]);
                max = intervals[i+1][1];
            }else{
                max = Math.max(max,intervals[i+1][1]);
            }
        }
        lst.add(max);
        list.add(lst);
        int arr[][] = new int[list.size()][2];
        for(int i =0;i<list.size();i++){
            arr[i][0] = list.get(i).get(0);
            arr[i][1] = list.get(i).get(1);
        }
        return arr;
    }
}