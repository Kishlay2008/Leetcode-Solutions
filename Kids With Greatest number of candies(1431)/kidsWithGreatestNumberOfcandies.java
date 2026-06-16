class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++){
          max = Math.max(max, candies[i]);
        }
         for(int i = 0; i < candies.length; i++){
            candies[i] += extraCandies;
         }
         ArrayList<Boolean> list = new ArrayList<>();
         for(int i = 0; i < candies.length; i++){
            if(max <= candies[i]){
                list.add(true);
            }
            else{
                list.add(false);
            }
         }
         return list;
    }
}