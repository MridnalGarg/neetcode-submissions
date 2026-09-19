class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];

        for(int i = len - 2; i >= 0; i--){
            int j = i+1;
            
            while(j < len && temperatures[j] <= temperatures[i]){
                if(res[j] == 0){
                    j = len;
                    break;
                }
                j += res[j];
            }

            if( j < len){
                res[i] = j - i;
            }
        }
        return res;
    }
}
