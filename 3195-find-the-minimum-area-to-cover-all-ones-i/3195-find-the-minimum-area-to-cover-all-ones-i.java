class Solution {
    public int minimumArea(int[][] grid) {
        int max1 = 0;
        int min1 = Integer.MAX_VALUE;
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    min1 = Math.min(min1,i);
                    max1 = Math.max(max1,i);
                    break;
                }
            }
        }
        int max2 = 0;
        int min2 = Integer.MAX_VALUE;
        for(int i =0;i<grid[0].length;i++){
            for(int j = 0;j<grid.length;j++){
                if(grid[j][i] == 1){
                    min2 = Math.min(min2,i);
                    max2 = Math.max(max2,i);
                    break;
                }
            }
        }
        return (max2-min2+1)*(max1-min1+1);
    }
}