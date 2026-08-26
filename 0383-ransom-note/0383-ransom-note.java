class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map1=new HashMap();
        
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        for(int i=0;i<magazine.length();i++){
            map1.put(magazine.charAt(i),map1.getOrDefault(magazine.charAt(i),0)+1);
        }
        
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            if (!map1.containsKey(c) || map1.get(c) == 0) {
    return false;
}

map1.put(c, map1.get(c) - 1);
        }

      return true;  
    }
}