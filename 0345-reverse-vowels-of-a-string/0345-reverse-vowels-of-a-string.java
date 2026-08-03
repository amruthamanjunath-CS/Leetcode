class Solution {
    public String reverseVowels(String s) {
        HashSet<Character>set = new HashSet<>(Set.of('a','e','i','o','u','A','E','I','O','U'));

        StringBuilder temp=new StringBuilder(s);
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!set.contains(temp.charAt(left))){
                left++;
            }
            else if(!set.contains(temp.charAt(right))){
                right--;
            }
            else{
                char x=temp.charAt(left);
                temp.setCharAt(left,temp.charAt(right));
                temp.setCharAt(right,x);
                left++;
                right--;
            }
            }
            return temp.toString();
        }
        
    }
