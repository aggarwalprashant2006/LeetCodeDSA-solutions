class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1]-position[0];
        while(low <= high){
            int mid = low+(high-low)/2;
            int count = 1;
            int a = position[0];
            for(int i =1;i<position.length;i++){
                if(position[i]-a >= mid){
                    count++;
                    a = position[i];
                }
            }
            if(count >= m){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }
}