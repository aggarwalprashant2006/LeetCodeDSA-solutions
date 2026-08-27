class Solution {
    public int minimumSum(int num) {
        int arr[]= new int[4];
        int i = 0;
        while(num > 0){
            arr[i] = num % 10;
            i++;
            num /= 10;
        }
        Arrays.sort(arr);
        int sum1 = arr[0]*10+arr[arr.length-1];
        int sum2 = arr[1]*10+arr[arr.length-2];
        return sum1+sum2;
    }
}