class Solution {
    public int hammingWeight(int n) {
        int i=0;
        int count=0;
       while(i<32){
        int BitMask=1<<i;
        if((n & BitMask)!=0){
            count++;
        }
        i++;
       }
       return count;
    }
}