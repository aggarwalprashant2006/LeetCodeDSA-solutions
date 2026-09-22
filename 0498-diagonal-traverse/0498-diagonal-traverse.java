class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int arr[] = new int[m*n];
        int i = 0;
        int j = 0;
        int d = 0;
        int e = 0;
        int count = 0;
        int z = 0;
        while(i < m && j < n){
            List<Integer> lst = new ArrayList<>();
            int a = i;
            for(int f = i;f >= 0 && j < n;f--){
                lst.add(mat[f][j]);
                j++;
            }
            count++;
            if(count%2 == 0){
                Collections.reverse(lst);
            }
            for(int k = 0;k<lst.size();k++){
                arr[z] = lst.get(k);
                z++;
            }
            e++;
            i = e;
            if(i >= m){
                i = m-1;
                j = e-(m-1); 
            }else{
                i = e;
                j = 0;
            }
        }
        return arr;
    }
}