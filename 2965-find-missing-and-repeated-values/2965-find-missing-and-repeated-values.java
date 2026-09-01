class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int max = grid.length*grid[0].length;
        int a = -1;
        int b = -1;
        HashSet<Integer> map = new HashSet<>();
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(!map.contains(grid[i][j])){
                    map.add(grid[i][j]);
                }else{
                    a = grid[i][j];
                }
            }
        }
        int i = 1;
        while(i<=max){
            if(!map.contains(i)){
                b = i;
                break;
            }
            i++;
        }
        return new int[]{a,b};
    }
}