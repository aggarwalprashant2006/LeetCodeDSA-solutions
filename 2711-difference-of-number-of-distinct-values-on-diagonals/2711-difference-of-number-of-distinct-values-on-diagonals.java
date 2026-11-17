class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int arr[][] = new int[grid.length][grid[0].length];
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                HashSet<Integer> set1 = new HashSet<>();
                HashSet<Integer> set2 = new HashSet<>();
                int a = i+1;
                int b = j+1;
                while(a < grid.length && b < grid[0].length){
                    set1.add(grid[a][b]);
                    a++;b++;
                }
                a = i-1;
                b = j-1;
                while(a >= 0 && b >= 0){
                    set2.add(grid[a][b]);
                    a--;b--;
                }
                arr[i][j] = Math.abs(set1.size()-set2.size());
            }
        }
        return arr;
    }
}