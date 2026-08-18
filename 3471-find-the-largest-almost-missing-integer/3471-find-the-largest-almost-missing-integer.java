class Solution {
    public int largestInteger(int[] nums, int k) {
    int[] freq = new int[51];
for (int num : nums) {
    freq[num]++;
}
if(k==1){

int ans = -1;

for (int num : nums) {
    if (freq[num] == 1) {
        ans = Math.max(ans, num);
    }
}
    return ans;

    }
else if(k==nums.length){
    int max=nums[0];
    for(int i=0;i<nums.length;i++){
    max=Math.max(max,nums[i]);
    }
    return max;
}

else{
    int m1=nums[0];
    int m2=nums[nums.length-1];
    if(freq[m1]==1 && freq[m2]==1){
        return Math.max(m1,m2);
    }
    else if(freq[m1]==1 && freq[m2]!=1){
        return m1;
    }

    else if(freq[m1]!=1 && freq[m2]==1){
        return m2;
    }

    else{
        return -1;
    }
}

}

}