class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l=nums1.length;
        int m=nums2.length;
        int k=Math.max(l,m);
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] arr=new int[k];
       for(int i=0;i<l;i++){
        map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
       }
       int count=0;
       for(int i=0;i<m;i++){
        if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
            arr[count]=nums2[i];
            count++;
            map.put(nums2[i], map.getOrDefault(nums2[i], 0) - 1);
        }
       }
       
return Arrays.copyOf(arr, count);
    }
}