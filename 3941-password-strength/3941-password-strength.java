class Solution {
    public int passwordStrength(String password) {
        int sum = 0;
        HashSet<Character> map = new HashSet<>();
        String str = "!@#$";
        for(int i =0;i<password.length();i++){
            char ch = password.charAt(i);
            String str1 = String.valueOf(password.charAt(i));
            if(Character.isUpperCase(ch) && !map.contains(ch)){
                sum += 2;
                map.add(ch);
            }else if(Character.isLowerCase(ch) && !map.contains(ch)){
                sum += 1;
                map.add(ch);
            }else if(str.contains(str1) && !map.contains(ch)){
                sum += 5;
                map.add(ch);
            }else if(Character.isDigit(ch) && !map.contains(ch)){
                sum += 3;
                map.add(ch);
            }
        }
        return sum;
    }
}