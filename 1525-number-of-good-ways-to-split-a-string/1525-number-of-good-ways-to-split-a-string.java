class Solution {
    public int numSplits(String s) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int sum = 0;
        map1.put(s.charAt(0),1);
        int count1 = 1;
        int count2 = 0;
        for(int i = 1;i<s.length();i++){
            char ch = s.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch, map2.get(ch) + 1);
            }
            else{
                map2.put(ch, 1);
                count2++;
            }
        }
        if(count1 == count2){
            sum++;
        }
        for(int i = 1;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            }else{
                map1.put(s.charAt(i),1);
                count1++;
            }
            map2.put(s.charAt(i),map2.get(s.charAt(i))-1);
            if(map2.get(s.charAt(i)) == 0){
                count2--;
            }
            if(count1 == count2){
                sum++;
            }
        }
        return sum;
    }
}