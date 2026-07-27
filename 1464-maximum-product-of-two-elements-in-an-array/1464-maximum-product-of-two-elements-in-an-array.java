
class Solution {
    public int maxProduct(int[] nums) {
       int ans=0;
        for(int i=0;i<nums.length;i++){
             int max=0;
             
            for(int j=i+1;j<nums.length;j++){
                int product=(nums[i]-1)*(nums[j]-1);
                if(product>max){
                    max=product;
                }
                }
                
                ans=Math.max(ans,max);
        }
        return ans;
    }
}