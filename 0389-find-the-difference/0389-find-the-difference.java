class Solution {
    public char findTheDifference(String s, String t) {
        char xor=0;
        for(int i=0;i<t.length();i++){
            if(i<s.length()){
                xor^=s.charAt(i);
            }
            xor^=t.charAt(i);
        }
        return xor;
        }
    }
