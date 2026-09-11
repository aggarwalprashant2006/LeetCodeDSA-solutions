class Solution {
    public int[] findEvenNumbers(int[] digits) {
        TreeSet<Integer> set = new TreeSet<>();
        int count = 0;
        for(int i =0;i<digits.length;i++){
            for(int j = 0;j<digits.length;j++){
                for(int k = 0;k<digits.length;k++){
                    if(((i != j) && (i != k)) && (j != k)){
                        int a = (digits[i]*10+digits[j])*10+digits[k];
                        if((a%2 == 0 && !set.contains(a)) && (a >= 100)){
                            set.add(a);
                        }
                    }
                }
            }
        }
        int[] arr = new int[set.size()];
        int i = 0;

        while (!set.isEmpty()) {
            arr[i] = set.pollFirst();
            i++;
        }
        return arr;
    }
}