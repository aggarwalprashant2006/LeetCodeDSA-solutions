class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i =0;i<startTime.length();i++){
            if(Character.isDigit(startTime.charAt(i)) && i < 2){
                int k = startTime.charAt(i)-'0';
                a = a*10+k;
            }else if(Character.isDigit(startTime.charAt(i)) && i < 5){
                int k = startTime.charAt(i)-'0';
                b = b*10+k;
            }else if(Character.isDigit(startTime.charAt(i))){
                int k = startTime.charAt(i)-'0';
                c = c*10+k;
            }
        }
        int d = (a*60*60)+(b*60)+c;
        int e = 0;
        int f = 0;
        int g = 0;
        for(int i =0;i<endTime.length();i++){
            if(Character.isDigit(endTime.charAt(i)) && i < 2){
                int k = endTime.charAt(i)-'0';
                e = e*10+k;
            }else if(Character.isDigit(endTime.charAt(i)) && i < 5){
                int k = endTime.charAt(i)-'0';
                f = f*10+k;
            }else if(Character.isDigit(endTime.charAt(i))){
                int k = endTime.charAt(i)-'0';
                g = g*10+k;
            }
        }
        int h = (e*60*60)+(f*60)+g;
        return Math.abs(h-d);
    }
}