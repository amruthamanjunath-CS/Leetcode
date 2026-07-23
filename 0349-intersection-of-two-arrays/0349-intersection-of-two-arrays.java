class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>map=new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            map.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(map.contains(nums2[j]) && (!list.contains(nums2[j]))){
                list.add(nums2[j]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}