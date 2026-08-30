import java.util.*;
class Solution { 
    public String removeOccurrences(String s, String part) { 
        if(s.length() < part.length()){
            return s;
        }
        
        Stack<Character> str = new Stack<>();
        for(int  i =0;i<part.length()-1;i++){
            str.push(s.charAt(i));
        }
        
        for(int i = part.length()-1; i < s.length(); i++){ 
                str.push(s.charAt(i));
                    if (str.size() < part.length()) {
                        continue;
                    }
                int k1 = str.size()-part.length();
                int size = str.size(); 
                List<Character> lst = new ArrayList<>();
                while(k1 < size){
                    lst.add(str.pop());
                    k1++;
                }
                
                Collections.reverse(lst); 
                
                int count = 0; 
                
                for(int j = 0; j < lst.size(); j++){ 
                    if(lst.get(j) != part.charAt(j)){ 
                        count++; 
                        break; 
                    } 
                } 
                
                if(count != 0){ 
                    for(int k = 0; k < lst.size(); k++){ 
                        str.push(lst.get(k)); 
                    } 
                } 
        } 
        
        char arr[] = new char[str.size()]; 
        int i = 0; 
        
        while(!str.isEmpty()){ 
            arr[i] = str.pop(); 
            i++; 
        } 
        
        int si = 0; 
        int ei = arr.length - 1; 
        
        while(si < ei){ 
            char temp = arr[si]; 
            arr[si] = arr[ei]; 
            arr[ei] = temp; 
            si++; 
            ei--; 
        } 
        
        return new String(arr); 
    } 
}