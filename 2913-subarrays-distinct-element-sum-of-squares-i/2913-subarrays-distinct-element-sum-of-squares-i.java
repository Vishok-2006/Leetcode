class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            HashSet<Integer> distinctSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                distinctSet.add(nums.get(j));
                int distinctCount = distinctSet.size();
                sum += distinctCount * distinctCount;
            }
        }
        
        return sum;
    }
}