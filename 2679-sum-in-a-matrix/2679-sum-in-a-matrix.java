class Solution {
    public int matrixSum(int[][] nums) {
        int score = 0;
        int i = 0;
        while(i < nums[0].length){
            int max1 = 0;
            for(int j = 0;j < nums.length;j++){
                int max = 0;
                int a = 0;
                for(int k = 0;k < nums[0].length; k++){
                    if(max < nums[j][k]){
                        max = nums[j][k];
                        a = k;
                    }
                }
                nums[j][a] = -1;
                max1 = Math.max(max1,max);
            }
            score += max1;
            i++;
        }
        return score;
    }
}