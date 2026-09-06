class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1;
        int right = piles[piles.length - 1];
        int minRate = right;


        while(left <= right){
            int mid = left + (right - left) / 2;
            int hr = 0;

            for(int p : piles){
                hr += Math.ceil((double)p / mid);
            }
            
            if(hr <= h) {
                minRate = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return minRate;
    }
}
