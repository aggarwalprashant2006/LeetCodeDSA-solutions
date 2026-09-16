class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int i = 0;
        while(i < grid.length){
            int si = i;
            int ei = 0;
            List<Integer> lst = new ArrayList<>();
            while(si < grid.length && ei < grid[0].length){
                lst.add(grid[si][ei]);
                si++;
                ei++;
            }
            Collections.sort(lst);
            si = i;
            ei = 0;
            int j = lst.size()-1;
            while(si < grid.length && ei < grid[0].length){
                grid[si][ei] = lst.get(j);
                si++;
                ei++;
                j--;
            }
            i++;
        }
        int k  = 1;
        while(k < grid[0].length){
            int si = k;
            int ei = 0;
            List<Integer> lst = new ArrayList<>();
            while(si < grid[0].length && ei < grid.length){
                lst.add(grid[ei][si]);
                si++;
                ei++;
            }
            Collections.sort(lst);
            si = k;
            ei = 0;
            int j = 0;
            while(si < grid[0].length && ei < grid.length){
                grid[ei][si] = lst.get(j);
                si++;
                ei++;
                j++;
            }
            k++;
        }
        return grid;
    }
}