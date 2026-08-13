class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int n=arr.length;
        List<Integer> l=new ArrayList<>();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i: arr){
            m.put(i,m.getOrDefault(i,0)+1);
            if(m.get(i)>1 && !l.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}