class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i =0;i<digits.length;i++){
            for(int j = 0;j<digits.length;j++){
                for(int k = 0;k<digits.length;k++){
                    if(((i != j) && (i != k)) && (j != k)){
                        int a = (digits[i]*10+digits[j])*10+digits[k];
                        if((a%2 == 0 && !set.contains(a)) && (a >= 100)){
                            count++;
                            set.add(a);
                        }
                    }
                }
            }
        }
        return count;
    }
}