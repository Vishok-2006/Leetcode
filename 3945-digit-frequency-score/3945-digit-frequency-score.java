class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> m=new HashMap<>();
        Set<Integer> st=new HashSet<>();
        int t=n;
        while(t!=0){
            int r=t%10;
            m.put(r,m.getOrDefault(r,0)+1);
            st.add(r);
            t/=10;
        }
        int s=0;
         for(int k: st){
            int o= k*m.get(k);
            s+=o;
         }
        return s;
    }
}