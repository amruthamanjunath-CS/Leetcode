class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer>map=new HashSet<>();
        for (int num : nums) {
            map.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}