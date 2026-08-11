class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                ans=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(max<2*nums[i] && i!=ans){
                return -1;
            }
        }
        return ans;
    }
}