class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1;
        }
        int res=0;
        Map<Character,Integer> m=new HashMap<>();
        Set<Character> st=new HashSet<>();
        for(char c: s.toCharArray()){
            st.add(c);
           m.put(c,m.getOrDefault(c,0)+1);
          
        }
      boolean b=false;
        for(char c : st){
            if(m.get(c)%2==0){
                res+=m.get(c);
            }
            else{
                  res+=m.get(c)-1;
                  b=true;
            }
        }
      if(b) res++;
        return res;
    }
}