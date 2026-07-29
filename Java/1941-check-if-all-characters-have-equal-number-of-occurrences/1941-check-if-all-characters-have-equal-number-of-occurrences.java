class Solution {
    public boolean areOccurrencesEqual(String s) {
        char c[]= s.toCharArray();
        Map<Character,Integer> m=new HashMap<>();
        
        for(char ch:c){
            m.put(ch,m.getOrDefault(ch,0)+1);
          
        }
          int count = m.values().iterator().next();

        for (int value : m.values()) {
            if (value != count) {
                return false;
            }
        }

        return true;

    }
}