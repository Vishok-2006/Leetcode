class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        
        for(int i: nums){
           m.put(i,m.getOrDefault(i,0)+1);
           
        }
        List<Integer> l=new ArrayList<>(m.keySet());
        l.sort((a,b) -> m.get(b)-m.get(a));
        int[] arr=new int[k];
      
        for(int i=0;i<k;i++){
            arr[i]=l.get(i);
            
        }
        return arr;

    }
}