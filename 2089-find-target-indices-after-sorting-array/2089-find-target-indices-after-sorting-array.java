class Solution {
    public List<Integer> targetIndices(int[] arr, int t) {
        Arrays.sort(arr);
        List<Integer> l=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                l.add(i);
            }
        }
        return l;
    }
}