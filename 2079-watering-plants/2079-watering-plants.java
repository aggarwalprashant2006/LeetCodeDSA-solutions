class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int sum = 0;
        int a = capacity;
        for(int i =0;i<plants.length;i++){
            if(plants[i] <= capacity){
                capacity -= plants[i];
                sum += 1;
            }else{
                sum += i+i+1;
                capacity = a;
                capacity -= plants[i];
            }
        }
        return sum;
    }
}