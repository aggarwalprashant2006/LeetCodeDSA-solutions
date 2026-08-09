class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i =0;i<details.length;i++){
            String str = details[i];
            for(int j = 11;j < 13;j++){
                int a = Integer.parseInt(String.valueOf(str.charAt(j)));
                int b = Integer.parseInt(String.valueOf(str.charAt(j+1)));
                int c = a*10+b;
                if(c > 60){
                    count++;
                }
                break;
            }
        }
        return count;
    }
}