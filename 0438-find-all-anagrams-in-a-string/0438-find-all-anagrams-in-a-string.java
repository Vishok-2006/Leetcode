class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        String c=new String();
        int n1=s.length();
        int n2=p.length();
        char st[]=p.toCharArray();
        Arrays.sort(st);
        List<Integer> count=new ArrayList<>();
        for(int i=0;i<=n1-n2;i++){

                c=s.substring(i,i+n2);
                char str[]=c.toCharArray();
               
                Arrays.sort(str);
                if(Arrays.equals(st,str)){
                      count.add(i);
                }
            
        }
        return count;
    }
}