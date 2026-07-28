class Solution {
    public int maximumProduct(int[] n) {
       Arrays.sort(n);
       int p=n.length;
       return Math.max((n[p-1]*n[p-2]*n[p-3]),(n[0]*n[1]*n[p-1]));
    }
}