class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } 
            else {
                st.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } 
            else {
                st1.push(t.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        while (!st1.isEmpty()) {
            sb1.append(st1.pop());
        }

        return sb.toString().equals(sb1.toString());
    }
}