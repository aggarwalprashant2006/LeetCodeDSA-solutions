class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        for(int i =0;i<restaurants.length;i++){
            if(veganFriendly == 1){
                if((restaurants[i][2] == 1) && (restaurants[i][3] <= maxPrice && restaurants[i][4] <= maxDistance)){
                    lst.add(restaurants[i][0]);
                    lst.add(restaurants[i][1]);
                }
            }else{
                if((restaurants[i][3] <= maxPrice) && restaurants[i][4] <= maxDistance){
                    lst.add(restaurants[i][0]);
                    lst.add(restaurants[i][1]);
                }
            }
            if(!lst.isEmpty()){
                list.add(lst);
            }
            lst = new ArrayList<>();
        }
        List<Integer> lst1 = new ArrayList<>();
        list.sort((a, b) -> {
            if (!a.get(1).equals(b.get(1))) {
                return Integer.compare(b.get(1), a.get(1));
            }

            return Integer.compare(b.get(0), a.get(0));
        });
        for(int i = 0;i<list.size();i++){
            lst1.add(list.get(i).get(0));
        }
        return lst1;
    }
}