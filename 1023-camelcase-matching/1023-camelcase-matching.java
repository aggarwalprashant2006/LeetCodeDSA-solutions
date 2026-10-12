class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> lst = new ArrayList<>();
        for(int k = 0; k < queries.length; k++){
            String str = queries[k];
            List<String> lst2 = new ArrayList<>();
            int c = 0;
            while(c < str.length()){
                int d = c + 1;
                StringBuilder sb1 = new StringBuilder();
                sb1.append(str.charAt(c));
                while(d < str.length() && !Character.isUpperCase(str.charAt(d))){
                    sb1.append(str.charAt(d));
                    d++;
                }
                lst2.add(sb1.toString());
                c = d;
            }

            int e = 0;
            int f = 0;
            int count = 0;
            int h = 0;

            while(e < lst2.size()){
                String str1 = lst2.get(e);
                String str2 = pattern;
                int g = 0;
                while(g < str1.length()){
                    if(h < str2.length() &&
                       str1.charAt(g) == str2.charAt(h)){
                        h++;
                    }else if(Character.isUpperCase(str1.charAt(g))){
                        count++;
                        break;
                    }
                    g++;
                }

                if(count > 0){
                    break;
                }
                e++;
                f++;
            }

            lst.add(count == 0 && h == pattern.length());
        }
        return lst;
    }
}