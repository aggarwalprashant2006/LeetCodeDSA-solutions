class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> map1 = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();
        int count = 0;
        int arr[] = new int[A.length];
        for(int i =0;i<A.length;i++){
            map1.add(A[i]);
            map2.add(B[i]);
            if(map1.contains(B[i])){
                count++;
            }if(map2.contains(A[i])){
                count++;
            }
            if(A[i] == B[i]){
                count--;
            }
            arr[i] = count;
        }
        return arr;
    }
}