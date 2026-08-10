class Solution {
    public int getLeastFrequentDigit(int n) {
        List<Integer> lst = new ArrayList<>();
        while(n > 0){
            lst.add(n % 10);
            n /= 10;
        }
        Collections.sort(lst);
        int count = 1;
        int a = -1;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<lst.size()-1;i++){
            if(lst.get(i) == lst.get(i+1)){
                count++;
            }else{
               if(min > count){
                min = count;
                a = lst.get(i);
               }
                count = 1;
            }
        }
        if(min > count){
            min = count;
            a = lst.get(lst.size()-1);
        }
        return a;
    }
}