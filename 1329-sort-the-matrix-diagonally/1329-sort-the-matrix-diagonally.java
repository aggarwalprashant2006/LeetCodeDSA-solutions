class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int i = 0;
        while(i < mat.length){
            int si = i;
            int ei = 0;
            List<Integer> lst = new ArrayList<>();
            while(si < mat.length && ei < mat[0].length){
                lst.add(mat[si][ei]);
                si++;
                ei++;
            }
            Collections.sort(lst);
            si = i;
            ei = 0;
            int j = 0;
            while(si < mat.length && ei < mat[0].length){
                mat[si][ei] = lst.get(j);
                si++;
                ei++;
                j++;
            }
            i++;
        }
        int k  = 1;
        while(k < mat[0].length){
            int si = k;
            int ei = 0;
            List<Integer> lst = new ArrayList<>();
            while(si < mat[0].length && ei < mat.length){
                lst.add(mat[ei][si]);
                si++;
                ei++;
            }
            Collections.sort(lst);
            si = k;
            ei = 0;
            int j = 0;
            while(si < mat[0].length && ei < mat.length){
                mat[ei][si] = lst.get(j);
                si++;
                ei++;
                j++;
            }
            k++;
        }
        return mat;
    }
}