class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int arr[] = new int[matrix.length];
        int arr1[] = new int[matrix[0].length];
        for(int i =0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j =0;j<matrix[0].length;j++){
                min = Math.min(min,matrix[i][j]);
            }
            arr[i] = min;
        }
        for(int i =0;i<matrix[0].length;i++){
            int max = Integer.MIN_VALUE;
            for(int j =0;j<matrix.length;j++){
                max = Math.max(max,matrix[j][i]);
            }
            arr1[i] = max;
        }
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr1.length;j++){
                if(arr[i] == arr1[j]){
                    List<Integer> lst = new ArrayList<>();
                    lst.add(arr[i]);
                    return lst;
                }
            }
        }
        return new ArrayList<>();
    }
}