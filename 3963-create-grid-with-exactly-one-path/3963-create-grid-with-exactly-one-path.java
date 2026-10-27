class Solution {
    public String[] createGrid(int m, int n) {
        String arr[] = new String[m];
        StringBuilder sb = new StringBuilder();
        for(int j = 0;j<n;j++){
            sb.append(".");
        }
        arr[0] = sb.toString();
        for(int i = 1;i<m;i++){
            sb = new StringBuilder();
            for(int j = 0;j<n-1;j++){
                sb.append("#");
            }
            sb.append(".");
            arr[i] = sb.toString();
        }
        return arr;
    }
}