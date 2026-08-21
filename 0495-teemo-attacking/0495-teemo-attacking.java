class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans=0;
        for(int i=0;i<timeSeries.length-1;i++){
            int time=timeSeries[i+1]-timeSeries[i];
            if(time<duration){
                ans+=time;
            }
            else{
                ans+=duration;
            }
        }
        ans+=duration;
        return ans;

    }
}