class Solution {
    public boolean sumGame(String num) {
        int bob=0;
        int al=0;
        int bobsum=0;
        int alsum=0;
        
        
        for(int i=0;i<num.length()/2;i++){
            char c=num.charAt(i);
            if (c=='?'){
                 bob+=1;
            }
            else{
                int digit=c-'0';
                bobsum+=digit;
            }
        }
        for(int i=num.length()/2;i<num.length();i++){
            char c=num.charAt(i);
            if(c=='?'){
                 al+=1;
            }
            else{
                int digit=c-'0';
                alsum+=digit;
            }
        }
int sumDifference = bobsum - alsum;
int questionDifference = bob - al;

return sumDifference * 2 + questionDifference * 9 != 0;
        
 }
}