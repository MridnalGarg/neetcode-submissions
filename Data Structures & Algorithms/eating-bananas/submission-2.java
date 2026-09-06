class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        
        for(int p : piles){
            right = Math.max(right, p);
        }

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
