class Solution {
    public int fib(int n) {
       int n1=0;
       int n2=1;
       int count=2;
        int ans=0;
        if(n==0){
            return n1;
        }
        else if(n==1){
            return n2;
        }
     
        
        else{
            while(count<=n){
                ans=n1+n2;
                n1=n2;
                n2=ans;
                count++;
            }
        }
        return ans;
    }
}