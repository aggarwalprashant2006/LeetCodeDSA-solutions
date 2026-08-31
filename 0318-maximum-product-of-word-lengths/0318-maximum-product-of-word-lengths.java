class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i =0;i<words.length;i++){
            String str = words[i];
            HashSet<Character> map = new HashSet<>();
            for(int j =0;j<str.length();j++){
                map.add(str.charAt(j));
            }
            for(int j = i+1;j<words.length;j++){
                String str2 = words[j];
                int count = 0;
                for(int k =0;k<str2.length();k++){
                    if(map.contains(str2.charAt(k))){
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    max = Math.max(max,str.length()*str2.length());
                }
            }
        }
        return max;
    }
}