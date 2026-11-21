class Solution {
    public int minFlips(int[][] grid) {
        int min1 = 0;
        for(int i =0;i<grid.length;i++){
            int j = 0;
            int k = grid[0].length-1;
            while(j < k){
                if(grid[i][j] != grid[i][k]){
                    min1++;
                }
                j++;
                k--;
            }
        }
        int min2 = 0;
        for(int i =0;i<grid[0].length;i++){
            int j = 0;
            int k = grid.length-1;
            while(j < k){
                if(grid[j][i] != grid[k][i]){
                    min2++;
                }
                j++;
                k--;
            }
        }
        return Math.min(min1,min2);
    }
}