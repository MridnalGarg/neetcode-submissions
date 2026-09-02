class Solution {
    public int maxProfit(int[] prices) {
         int maxProf = 0;
         int minPrice = Integer.MAX_VALUE;

         for(int price: prices){
            if(minPrice > price){
                minPrice = price;
            }else{
                maxProf = Math.max(maxProf, price - minPrice);
            }
         }

        return maxProf;
    }
}
