class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int count = 0;
        int max = 0;
        int i = 0;
        while(i < answerKey.length() && count < k){
            if(answerKey.charAt(i) == 'F'){
                count++;
            }
            i++;
        }
        max = Math.max(max,i);
        int j = i;
        int a = 0;
        while(j < answerKey.length()){
            if(answerKey.charAt(j) == 'F'){
                count++;
            }
            while(count > k){
                if(answerKey.charAt(a) == 'F'){
                    count--;
                }
                a++;
            }
            max = Math.max(max,j-a+1);
            j++;
        }
        count = 0;
        int max2 = 0;
        i = 0;
        while(i < answerKey.length() && count < k){
            if(answerKey.charAt(i) == 'T'){
                count++;
            }
            i++;
        }
        max2 = Math.max(max2,i);
        j = i;
        a = 0;
        while(j < answerKey.length()){
            if(answerKey.charAt(j) == 'T'){
                count++;
            }
            while(count > k){
                if(answerKey.charAt(a) == 'T'){
                    count--;
                }
                a++;
            }
            max2 = Math.max(max2,j-a+1);
            j++;
        }
        return Math.max(max,max2);
    }
}