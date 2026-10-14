class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> set = new HashMap<>();
        HashMap<Character, Integer> set1 = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            set.put(ch, set.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int count = 0;
        int a = 0;
        int b = -1;
        int max = Integer.MAX_VALUE;

        while(i < s.length() && count < t.length()){
            char ch = s.charAt(i);

            if(set.containsKey(ch)){
                set1.put(ch, set1.getOrDefault(ch, 0) + 1);

                if(set1.get(ch) <= set.get(ch)){
                    count++;
                }
            }
            i++;
        }

        int j = i - 1;
        int k = 0;

        while(j < s.length()){
            if(j >= i){
                char ch = s.charAt(j);

                if(set.containsKey(ch)){
                    set1.put(ch, set1.getOrDefault(ch, 0) + 1);

                    if(set1.get(ch) <= set.get(ch)){
                        count++;
                    }
                }
            }

            while(count == t.length()){
                int d = j - k + 1;

                if(max > d){
                    a = k;
                    b = j;
                    max = d;
                }

                char ch = s.charAt(k);

                if(set.containsKey(ch)){
                    if(set1.get(ch) <= set.get(ch)){
                        count--;
                    }
                    set1.put(ch, set1.get(ch) - 1);
                }
                k++;
            }
            j++;
        }

        StringBuilder sb = new StringBuilder();
        for(int d = a; d <= b; d++){
            sb.append(s.charAt(d));
        }

        return sb.toString();
    }
}