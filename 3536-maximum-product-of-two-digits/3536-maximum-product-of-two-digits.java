class Solution {

    public int maxProduct(int n) {
        int temp=n;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        int arr[]=new int[count];
        int x=0;
        while(n>0){
       int last= n%10;
       n=n/10;
        arr[x]=last;
        x++;
       }
       Arrays.sort(arr);
    return arr[count-1]*arr[count-2];
    }
}