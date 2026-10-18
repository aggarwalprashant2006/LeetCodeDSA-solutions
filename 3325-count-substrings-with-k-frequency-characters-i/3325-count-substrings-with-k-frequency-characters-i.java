class Solution {
    public int numberOfSubstrings(String s, int k) {
        int i = 0;
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(i < s.length()){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            i++;
            if(map.get(s.charAt(i-1)) >= k){
                break;
            }
        }
        int j = i-1;
        int a = 0;
        char b = s.charAt(i-1);
        while(j < s.length()){
            if(j >= i){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j), 0) + 1);
                if(map.get(s.charAt(j))>=k){
                    b = s.charAt(j);
                }
            }
             while(map.getOrDefault(b, 0) >= k){
                count += s.length()-j;
                map.put(s.charAt(a), map.getOrDefault(s.charAt(a), 0)-1);
                a++;
            }
            j++;
        }
        return count;
    }
}