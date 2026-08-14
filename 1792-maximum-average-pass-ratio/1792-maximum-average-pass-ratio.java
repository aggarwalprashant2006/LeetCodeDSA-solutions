class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
        double x = (double)(a[0] + 1) / (a[1] + 1) - (double)a[0] / a[1];
        double y = (double)(b[0] + 1) / (b[1] + 1) - (double)b[0] / b[1];

        return Double.compare(y, x);
    });
        for(int i =0;i<classes.length;i++){
            pq.add(classes[i]);
        }
        while(extraStudents > 0){
            int arr[] = pq.remove();
            arr[0]++;
            arr[1]++;
            pq.add(arr);
            extraStudents--;
        }
        double avg = 0;
        while(!pq.isEmpty()){
            int arr[] = pq.remove();
            avg += (double)arr[0]/arr[1];
        }
        return (double)avg/classes.length;
    }
}