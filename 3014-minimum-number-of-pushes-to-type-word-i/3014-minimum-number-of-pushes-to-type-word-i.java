class Solution {
    HashMap<Character,Integer>map=new HashMap<>();
    
    public int minimumPushes(String word) {
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq, Collections.reverseOrder());
        int ans = 0;

    for (int i = 0; i < freq.size(); i++) {
        ans += freq.get(i) * (i / 8 + 1);
    }
      return ans;  
    }
}