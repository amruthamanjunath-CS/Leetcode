class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int product=1;
        while(temp!=0){
            int last=temp%10;
            temp/=10;
            sum+=last;
            product*=last;
        }
        int total=sum+product;
        if(n%total==0){
            return true;
        }
        else{
            return false;
        }
    }
}