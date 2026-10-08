class Solution {
    public String shiftingLetters(String str, int[] arr) {

        char[] s = str.toCharArray();

        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            sum = (sum + arr[i]) % 26;

            s[i] = (char) ('a' + (s[i] - 'a' + sum) % 26);
        }

        return new String(s);
    }
}