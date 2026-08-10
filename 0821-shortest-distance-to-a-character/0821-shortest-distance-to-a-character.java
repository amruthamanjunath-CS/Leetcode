class Solution {
    public int[] shortestToChar(String s, char c) {
    int arr[]=new int [s.length()];
     int last=-s.length();
    
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)==c){
            last=i;
        }
        arr[i]=i-last;
      }

     last=2*s.length();
     for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)==c){
            last=i;
        }
        arr[i]=Math.min(last-i,arr[i]);
      }

        
        
      
      
     return arr;  
    }
}