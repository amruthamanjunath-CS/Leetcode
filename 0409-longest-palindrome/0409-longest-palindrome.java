class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int ans=0;
    
    boolean odd=false;
for (var entry : map.entrySet()) {
    if (entry.getValue() % 2 == 0) {
        ans += entry.getValue(); 
    }
    else{
        ans+=entry.getValue()-1;
        odd=true;
    }
}

    if(odd){
        return ++ans;
    }
    else{
        return ans;
    }
    }
}