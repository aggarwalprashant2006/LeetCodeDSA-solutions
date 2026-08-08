class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> map1 = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();
        int arr[] = new int[A.length];
        for(int i =0;i<A.length;i++){
            map1.add(A[i]);
            map2.add(B[i]);
            int count = 0;
            for(int j =0;j<=i;j++){
                if(map1.contains(A[j]) && map2.contains(A[j])){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}