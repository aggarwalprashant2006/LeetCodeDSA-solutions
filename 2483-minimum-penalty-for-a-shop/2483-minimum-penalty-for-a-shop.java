class Solution {
    public int bestClosingTime(String customers) {
        int c1 = 0;
        for(int i =0;i<customers.length();i++){
            if(customers.charAt(i) == 'Y'){
                c1++;
            }
        }
        if(c1 == 0){
            return 0;
        }else if(c1 == customers.length()){
            return c1;
        }
        int min = c1;
        int sum1 = 0;
        int a = 0;
        for(int i =0;i<customers.length();i++){
            if(customers.charAt(i) == 'Y'){
                c1--;
            }else{
                sum1++;
            }
            if(min > c1+sum1){
                min = c1+sum1;
                a = i+1;
            }
        }
        return a;
    }
}