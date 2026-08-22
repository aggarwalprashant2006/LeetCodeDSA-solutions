class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> str = new Stack<>();
        while(num > 0){
            str.push(num%10);
            num /= 10;
        }
        if(str.size() == 4){
            int k = 0;
            while(k < str.peek()){
                sb.append("M");
                k++;
            }
            str.pop();
        }
        if(str.size() == 3){
            if(str.peek() == 4){
                sb.append("CD");
            }else if(str.peek() == 9){
                sb.append("CM");
            }else if(str.peek() < 4){
                int k = 0;
                while(k < str.peek()){
                    sb.append("C");
                    k++;
                }
            }else if(str.peek() >= 5){
                int k = 5;
                sb.append("D");
                while(k < str.peek()){
                    sb.append("C");
                    k++;
                }
            }
            str.pop();
        }
        if(str.size() == 2){
            if(str.peek() == 4){
                sb.append("XL");
            }else if(str.peek() == 9){
                sb.append("XC");
            }else if(str.peek() < 4){
                int k = 0;
                while(k < str.peek()){
                    sb.append("X");
                    k++;
                }
            }else if(str.peek() >= 5){
                int k = 5;
                sb.append("L");
                while(k < str.peek()){
                    sb.append("X");
                    k++;
                }
            }
            str.pop();
        }
        if(str.size() == 1){
            if(str.peek() == 4){
                sb.append("IV");
            }else if(str.peek() == 9){
                sb.append("IX");
            }else if(str.peek() < 4){
                int k = 0;
                while(k < str.peek()){
                    sb.append("I");
                    k++;
                }
            }else if(str.peek() >= 5){
                int k = 5;
                sb.append("V");
                while(k < str.peek()){
                    sb.append("I");
                    k++;
                }
            }
            str.pop();
        }
        return sb.toString();
    }
}