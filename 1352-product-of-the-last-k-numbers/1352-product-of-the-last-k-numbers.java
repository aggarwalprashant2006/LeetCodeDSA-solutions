class ProductOfNumbers {
    Stack<Integer> str;
    ArrayList<Integer> lst;
    public ProductOfNumbers() {
        str = new Stack<>();
        lst = new ArrayList<>();
    }
    
    public void add(int num) {
        str.push(num);
        lst.add(num);
    }
    
    public int getProduct(int k) {
        int prod = 1;
        int i = lst.size()-1;
        while(k > 0 && i >= 0){
            prod *= lst.get(i);
            i--;
            k--;
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */