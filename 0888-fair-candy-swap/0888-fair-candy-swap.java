class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int ans[]=new int[2];
        HashSet<Integer>set=new HashSet<>();
        int sum1=0;
        for(int i=0;i<aliceSizes.length;i++){
            sum1+=aliceSizes[i];
        }
        int sum2=0;
        for(int i=0;i<bobSizes.length;i++){
            set.add(bobSizes[i]);
            sum2+=bobSizes[i];
        }
        int diff=sum1-sum2;
        for(int i=0;i<aliceSizes.length;i++){
            if(set.contains(aliceSizes[i]-diff/2)){
                ans[1]=aliceSizes[i]-diff/2;
                ans[0]=aliceSizes[i];
            }
        }
       return ans; 
    }
}
        
       
        