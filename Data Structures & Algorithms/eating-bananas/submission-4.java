class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MAX_VALUE;
        
        int minRate = right;


        while(left <= right){
            int mid = left + (right - left) / 2;
            int hr = 0;

            for(int p : piles){
                hr += Math.ceil((double)p / mid);
                if (hr > h) {
                    break;
                }
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
