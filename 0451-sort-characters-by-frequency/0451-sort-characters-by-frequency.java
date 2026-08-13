class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>m=new TreeMap<>();
        for(char c: s.toCharArray()){
           m.put(c,m.getOrDefault(c,0)+1);
        }
        
       List<Map.Entry<Character, Integer>> list =
                new ArrayList<>(m.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {

            char c = entry.getKey();
            int i = entry.getValue();
            while(i>0){
                sb.append(c);
                i--;
            }
        }
        return sb.toString();
    }
}