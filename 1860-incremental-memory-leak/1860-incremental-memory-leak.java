class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int count = 1;
        int sum = 1;
        while(sum <= memory1 || sum <= memory2){
                if(memory1 >= memory2){
                    memory1 -= sum;
                }else{
                    memory2 -= sum;
                }
                sum++;
                count++;
        }
        int arr[] = new int[3];
        arr[0] = count;
        arr[1] = memory1;
        arr[2] = memory2;
        return arr;
    }
}