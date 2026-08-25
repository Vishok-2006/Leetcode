class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
        for(int i: nums){
            s.add(i);
        }
        int x=k;
        while(s.contains(x)){
            x+=k;
        }
        return x;
    }
}