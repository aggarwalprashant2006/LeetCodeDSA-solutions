class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empbot = numBottles;
        int sum = numBottles;
        int numbot = 0;
        while((empbot+numbot) >= numExchange){
            if(empbot >= numExchange){
                empbot -= numExchange;
                numExchange++;
                numbot++;
            }else if((empbot+numbot) >= numExchange){
                sum += numbot;
                numbot = 1;
                empbot = 0;
            }
        }
        return sum+numbot;
    }
}