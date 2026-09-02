class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i = 0;i<4;i++){
            int a = date.charAt(i) - '0';
            sum = sum*10+a;
        }
        String binary = Integer.toBinaryString(sum);
        sb.append(binary);
        sb.append('-');
        sum = 0;
        for(int i = 5;i<=6;i++){
            int a = date.charAt(i) - '0';
            sum = sum*10+a;
        }
        String binary1 = Integer.toBinaryString(sum);
        sb.append(binary1);
        sb.append('-');
        sum = 0;
        for(int i = 8;i<=9;i++){
            int a = date.charAt(i) - '0';
            sum = sum*10+a;
        }
        String binary2 = Integer.toBinaryString(sum);
        sb.append(binary2);
        return sb.toString();
    }
}