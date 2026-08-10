class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       
        List<Integer> res=new ArrayList<>();
        Map<Integer,Integer> s=new HashMap<>();
           
        for(int i=0;i<nums1.length;i++){
            s.put(nums1[i],s.getOrDefault(nums1[i],0)+1);
        }
       
        for(int i=0;i<nums2.length;i++){
            if(s.getOrDefault(nums2[i],0)>0){
                s.put(nums2[i],s.get(nums2[i])-1);
                res.add(nums2[i]);
            }
        }
        




        int[] arr=new int[res.size()];
        
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
            
        }
        return arr;
    }
}