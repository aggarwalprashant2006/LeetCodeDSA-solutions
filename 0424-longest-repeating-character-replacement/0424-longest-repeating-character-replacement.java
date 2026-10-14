class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;

        for(char ch = 'A'; ch <= 'Z'; ch++){
            int count = 0;
            int i = 0;

            while(i < s.length() && count < k){
                if(s.charAt(i) != ch){
                    count++;
                }
                i++;
            }

            max = Math.max(max, i);
            int j = i;
            int a = 0;

            while(j < s.length()){
                if(s.charAt(j) != ch){
                    count++;
                }

                while(count > k){
                    if(s.charAt(a) != ch){
                        count--;
                    }
                    a++;
                }

                max = Math.max(max, j - a + 1);
                j++;
            }
        }

        return max;
    }
}