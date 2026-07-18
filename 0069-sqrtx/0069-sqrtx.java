class Solution {
    public int mySqrt(int x) {
        int left=0;
        int right=x;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if (x < 2) {
    return x;
}
        if((long)mid*mid==x){
            return mid;
        }
        else if((long)mid*mid>x){
            right=mid-1;
        }
        else if((long)mid*mid<x){
            left=mid+1;
        }
    
       }
       return right;
    }
}