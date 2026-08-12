class Solution {
    public int minCost(String colors, int[] neededTime) {
        int mintime = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        HashSet<Character> set = new HashSet<>();
        for(int i =0;i<colors.length();i++){
            if(!set.contains(colors.charAt(i))){
                if(sum != min && min != Integer.MAX_VALUE){
                    sum -= min;
                    mintime += sum;
                }
                set.clear();
                set.add(colors.charAt(i));
                sum = 0;
                sum += neededTime[i];
                min = neededTime[i];
            }else{
                sum += neededTime[i];
                min = Math.max(min,neededTime[i]);
            }
        }
        if(sum != min && min != Integer.MAX_VALUE){
                    sum -= min;
                    mintime += sum;
        }
        return mintime;
    }
}