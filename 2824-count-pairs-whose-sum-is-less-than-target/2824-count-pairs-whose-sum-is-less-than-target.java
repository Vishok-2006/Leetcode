class Solution {
    public int countPairs(List<Integer> arr, int t) {
        int n=arr.size();
        int c=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i+1;j<n;j++){
                s=arr.get(i)+arr.get(j);
                if(s<t){
                    c++;
                }
            }
        }
        return c;
    }
}