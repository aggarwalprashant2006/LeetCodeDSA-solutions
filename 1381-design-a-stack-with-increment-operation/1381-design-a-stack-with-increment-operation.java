class CustomStack {
    Stack<Integer> str;
    int a = 0;
    public CustomStack(int maxSize) {
        str = new Stack<>();
        a = maxSize;
    }
    
    public void push(int x) {
        if(str.size() < a){
            str.push(x);
        }
    }
    
    public int pop() {
        if(!str.isEmpty()){
            return str.pop();
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        List<Integer> lst = new ArrayList<>();
        while(!str.isEmpty()){
            lst.add(str.pop());
        }
        int b =0;
        for(int i =lst.size()-1;i >= 0;i--){
            if(b < k){
                str.push(lst.get(i)+val);
                b++;
            }else{
                str.push(lst.get(i));
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */