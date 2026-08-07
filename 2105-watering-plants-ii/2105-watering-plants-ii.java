class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int si = 0;
        int ei = plants.length-1;
        int count = 0;
        int a = capacityA;
        int b = capacityB;
        while(si <= ei){
            if(si == ei){
                int c = Math.max(capacityA,capacityB);
                if(c < plants[si]){
                    count++;
                }
                return count;
            }
            if(plants[si] <= capacityA){
                capacityA -= plants[si];
                si++;
            }else if(plants[si] > capacityA){
                count++;
                capacityA = a;
                capacityA -= plants[si];
                si++;
            }if(plants[ei] <= capacityB){
                capacityB -= plants[ei];
                ei--;
            }else{
                count++;
                capacityB = b;
                capacityB -= plants[ei];
                ei--;
            }
        }
        return count;
    }
}