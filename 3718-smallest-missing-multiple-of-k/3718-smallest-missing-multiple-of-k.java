class Solution {
    public int missingMultiple(int[] nums, int k) {
        int j=1;
        while(true){
        boolean flag=false;
            for(int i=0;i<nums.length;i++){
                if(k*j==nums[i]){
                     flag=true;;
                     break;
                }
            }
            if(flag!=true){
                return k*j;
            }
            j++;
        }
    }
}