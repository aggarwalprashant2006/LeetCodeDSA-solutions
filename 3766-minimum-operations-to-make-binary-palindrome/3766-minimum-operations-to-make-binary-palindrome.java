
class Solution {
    public int[] minOperations(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            int num = nums[i];
            int c1 = 0;
            int c2 = 0;
            int b = num;
            int c = num;

            while(true){
                String s1 = Integer.toBinaryString(b);
                String r1 = new StringBuilder(s1).reverse().toString();

                if(s1.equals(r1)){
                    break;
                }
                c1++;
                b++;

                String s2 = Integer.toBinaryString(c);
                String r2 = new StringBuilder(s2).reverse().toString();

                if(s2.equals(r2)){
                    break;
                }
                c2++;
                c--;
            }

            arr[i] = Math.min(c1, c2);
        }
        return arr;
    }
}
