class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> m1=new HashMap<>();
        Map<String,Character> m2=new HashMap<>();
    
        char [] c=pattern.toCharArray();
        String[] str=s.split(" ");
        if(pattern.length() != str.length) return false;
        
        for(int i=0;i<c.length;i++){
             if(m1.containsKey(c[i])){
                if(!m1.get(c[i]).equals(str[i])){
                    return false;
                }

             }
            
             else {
                     if(m2.containsKey(str[i])){
                        return false;
                     }
                     m1.put(c[i],str[i]);
                     m2.put(str[i],c[i]);
              
             }

        }
       

        return true;
    }
}