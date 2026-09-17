class Solution {
    public int maxSum(int[][] grid) {
        int max = 0;
        for(int i =0;i+2<grid.length;i++){
            for(int j = 0;j+2<grid[0].length;j++){
                int a = grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                max = Math.max(max,a);
            }
        }
        return max;
    }
}