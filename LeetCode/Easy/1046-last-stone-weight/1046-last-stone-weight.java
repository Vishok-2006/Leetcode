class Solution {
    public int lastStoneWeight(int[] arr) {
       Queue<Integer> m=new PriorityQueue<>(Collections.reverseOrder());
       for(int n:arr){
        m.add(n);
       }
       while(m.size()>1){
        int n1=m.poll();
        int n2=m.poll();
        if(n1!=n2){
            m.add(n1-n2);
        }
       }
       if(m.size()==0) return 0;
       return m.peek();
    }
}