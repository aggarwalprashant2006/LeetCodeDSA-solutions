class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int i =0;
        int sign = 1;
        if(num1.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        while(i < num1.length() && Character.isDigit(num1.charAt(i))){
            a = a*10+(num1.charAt(i)-'0');
            i++;
        }
        a = a*sign;
        while (i < num1.length() && !Character.isDigit(num1.charAt(i)) && num1.charAt(i) != '-') {
            i++;
        }
        sign = 1;
        if(num1.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        while(i < num1.length() && Character.isDigit(num1.charAt(i))){
            b = b*10+(num1.charAt(i)-'0');
            i++;
        }
        b *= sign;
        i = 0;
        sign = 1;
        if(num2.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        while(i < num2.length() && Character.isDigit(num2.charAt(i))){
            c = c*10+(num2.charAt(i)-'0');
            i++;
        }
        c *= sign;
        while (i < num2.length() && !Character.isDigit(num2.charAt(i)) && num2.charAt(i) != '-') {
            i++;
        }sign = 1;
        if(num2.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        while(i < num2.length() && Character.isDigit(num2.charAt(i))){
            d = d*10+(num2.charAt(i)-'0');
            i++;
        }
        d *= sign;
        String str = String.valueOf((a*c)-(b*d));
        String str1 = String.valueOf((a*d)+(b*c));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("+");
        sb.append(str1);
        sb.append("i");
        return sb.toString();
    }
}