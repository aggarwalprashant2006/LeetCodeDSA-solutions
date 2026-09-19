class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Arrays.sort(worker);
        int arr[][] = new int[difficulty.length][2];
        for(int i =0;i<difficulty.length;i++){
            arr[i][0] = difficulty[i];
            arr[i][1] = profit[i];
        }
        Arrays.sort(arr,(a,b) -> a[0]-b[0]);
        int si = 0;
        int si1 = 0;
        int sum = 0;
        int max = 0;
        while(si < worker.length && si1 < arr.length){
            if(worker[si] >= arr[si1][0]){
                max = Math.max(max,arr[si1][1]);
                si1++;
            }else {
                sum += max;
                si++;
            }
        }
        if(si < worker.length){
            int a = worker.length-si;
            sum += a *max;
        }
        return sum;
    }
}