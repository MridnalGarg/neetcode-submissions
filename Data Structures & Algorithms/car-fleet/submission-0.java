class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] map = new double[n][2];

        for(int i=0; i<n;i++){
            map[i][0] = position[i];
            map[i][1] = (double)(target - position[i]) / speed[i];
        }

        Arrays.sort(
            map, 
            Comparator.comparingDouble(
                row -> row[0]
            ));

        int fleets = 0;
        double maxTime = 0;

        for(int i = n - 1; i >= 0; i--){
            if(map[i][1] > maxTime){
                fleets++;
                maxTime = map[i][1];
            }
        }
        return fleets;
    }
}
