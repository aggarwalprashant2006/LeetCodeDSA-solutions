class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks);
        Collections.sort(processorTime);
        int max = 0;
        int max1 = 0;
        int j = processorTime.size()-1;
        for(int i = 0 ; i < tasks.size();i++){
            if((i+1)%4 == 0){
                max1 = Math.max(max1,tasks.get(i));
                max = Math.max(max,max1+processorTime.get(j));
                j--;
                max1 = 0;
            }else{
                max1 = Math.max(max1,tasks.get(i));
            }
        }
        return max;
    }
}