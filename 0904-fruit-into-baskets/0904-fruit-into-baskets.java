class Solution {
    public int totalFruit(int[] fruits) {
        HashSet<Integer> set1 = new HashSet<>();
        int i = 0;
        int max = 0;
        while(i < fruits.length && (set1.size() < 3)){
            set1.add(fruits[i]);
            i++;
        }
        if(set1.size() >= 3){
            max = Math.max(max,i-1);
        }else{
            max = Math.max(max,i);
        }
        int j = i-1;
        int a = 0;
        while(j < fruits.length){
            if(j >= i){
                set1.add(fruits[j]);
            }
            while(set1.size() > 2){
                int b = a+1;
                while(b <= j && fruits[b] != fruits[a]){
                    b++;
                }                 //3,3,3,1,2,1,1,2,3,3,4]
                if(b > j){
                    set1.remove(fruits[a]);
                }
                a++;
            }

            max = Math.max(max,j-a+1);
            j++;
        }
        return max;
    }
}